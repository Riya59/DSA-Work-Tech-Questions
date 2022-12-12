// class ListNode {
// 	int data;
// 	ListNode next;

// 	ListNode (int data) {
// 		this.data = data;
// 	}
// }

class Solution {
	ListNode reverseLinkedList (ListNode head) {
		// add your logic here
		ListNode current = head;
		ListNode prev = null;
		ListNode next = null;
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
		
	}
}
