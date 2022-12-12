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
	void printLinkedList (ListNode head) {
	    // add your logic here
		ListNode current = head;
		while(current!=null){
			System.out.print(current.data + " ");
			current = current.next;
		}
		// System.out.println();
	}
}
