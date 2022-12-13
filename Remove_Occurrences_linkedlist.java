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
	ListNode removeOccurences(ListNode head, int key) {
		// add your logic here
		while(head!=null && head.data == key){
			head = head.next;
		}
		ListNode current = head;
		while(current!=null && current.next!=null){
			if(current.next.data == key){
				current.next = current.next.next;
			}
			else{
			current = current.next;
			}
		}
		return head;
	}
}
