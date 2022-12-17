/** This is the ListNode class definition

class ListNode {
	int data;
	ListNode next;

	ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}
**/
class Solution {
	
	ListNode reverseLinkedListRange(ListNode head, int left, int right) {
		// add your logic here
		ListNode curr = head;
		ListNode prev = null;
		int i;
		for(i=1;i<left;i++){
			prev = curr;
			curr = curr.next;
		}
		ListNode rtail = curr;
		ListNode rhead = null;
		ListNode next = null;
		
		while(i<=right){
			next = curr.next;
			curr.next = rhead;
			rhead = curr;
			curr = next;
			i++;
		}
		if(prev!=null){
			prev.next = rhead;
		}
		else{
			head = rhead;
		}
		rtail.next = curr;
		return head;
	}
}
