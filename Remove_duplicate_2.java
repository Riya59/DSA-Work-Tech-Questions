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
		ListNode prevNode = new ListNode(0);
		if(head == null || head.next == null){
			return head;
		}
		
		ListNode curr = head;
		head = prevNode;
		while(curr!=null && curr.next!=null){
			if(curr.next!=null && curr.next.data == curr.data){
				while(curr.next!=null && curr.next.data == curr.data){
					curr = curr.next;
				}
				prevNode.next = curr.next;
			}
			else{
				prevNode.next = curr;
				prevNode = prevNode.next;
			}
			curr = curr.next;
		}
		return head.next;
	}
}
