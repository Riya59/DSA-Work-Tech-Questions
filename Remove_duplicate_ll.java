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
	ListNode removeDuplicates(ListNode head) {
		// add your logic here
		ListNode current = head;
		while(current!=null){
			ListNode temp = current;
			while(temp!=null && (temp.data == current.data)){
				temp = temp.next;
			}
			current.next = temp;
			current = current.next;
		}
		return head;
	}
}
