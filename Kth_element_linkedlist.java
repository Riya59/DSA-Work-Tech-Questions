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
	ListNode kthElement (ListNode head, int k) {
	    // add your logic here
		int index = 0;
		ListNode current = head;
		while(current != null){
			index++;
			if(index == k){
				break;
			}
			current = current.next;
		}
		return current;
	}
}
