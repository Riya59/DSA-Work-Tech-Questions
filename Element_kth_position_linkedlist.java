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
	ListNode addAtkthElement (ListNode head, int k, ListNode newElement) {
	    // add your logic here
		int index = 0;
		ListNode current = head;
		if(k == 1){
			newElement.next = head;
			head = newElement;
			return head;
		}
		while(current!= null){
			index++;
			if(index == k-1){
				break;
			}
			current = current.next;
		}
		newElement.next = current.next;
		current.next = newElement;
		return head;
	}
}
