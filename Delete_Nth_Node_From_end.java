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
	ListNode removeXthNodeFromEnd(ListNode head, int x) {
		// add your logic here
		
		ListNode fast = head;
		ListNode slow = head;
	    for(int i=0;i<x;i++){
			fast = fast.next;
		}
		if(fast == null){
			head = head.next;
		return head;
		}
		
		while(fast.next!=null){
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return head;
	}
}
