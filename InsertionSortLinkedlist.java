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
	ListNode insertionSort(ListNode head) {
		// add your logic here
		ListNode dummy = new ListNode(-1);
		ListNode curr = head;
		while(curr!=null){
			ListNode temp = curr.next;
			ListNode prev = dummy;
			ListNode nxt = dummy.next;
			while(nxt!=null){
				if(nxt.data > curr.data){
					break;
				}
				prev = nxt;
				nxt = nxt.next;
			}
			curr.next = nxt;
			prev.next = curr;
			curr = temp;
			
		}
		return dummy.next;
	}
}
