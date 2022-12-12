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
	ListNode removekthElement (ListNode head, int k) {
	    // add your logic here
		int index = 0;
		ListNode current = head;
		if(k == 1){
			return head.next;
		}
		while(current != null){
			index++;
			if(index == k-1){
				break;
			}
			current = current.next;
		}
		current.next = current.next.next;
		return head;
	}
}
