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
	ListNode reverse(ListNode head){
		ListNode curr = head;
		ListNode prev = null;
		ListNode next = null;
		while(curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	ListNode addOne(ListNode head){
		ListNode curr = head;
		ListNode temp = null;
		int carry = 1;
		int sum;
		while(head!=null){
			sum = carry+head.data;
			carry = (sum>=10)?1:0;
			sum = sum%10;
			head.data = sum;
			temp = head;
			head = head.next;
		
		}
		if(carry>0){
				temp.next = new ListNode(carry);
			}
		return curr;
	}
	ListNode addOneToList(ListNode head) {
		// add your logic here
		head = reverse(head);
		head = addOne(head);
		return reverse(head);
	}
}
