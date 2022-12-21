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
	ListNode rotateListByK(ListNode head, int k) {
		// add your logic here
		if(head == null || k == 0){
			return head;
		}
		ListNode curr = head;
		int count = 0;
		while(curr.next!=null){
			curr = curr.next;
			count++;
		}
		count++;//last node
		curr.next = head;
		int rotatePoint = count - k%count;
		curr = head;
		while(rotatePoint-- > 1){
			curr = curr.next;
		}
		head = curr.next;
		curr.next = null;
		return head;
	}
}
