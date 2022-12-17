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
	
	
	ListNode addTwoNumbers(ListNode firstList, ListNode secondList) {
		// add your logic here
	
		ListNode head = null;
		ListNode prev = null;
		int carry = 0;
		while(firstList!=null || secondList!=null || carry!=0){
			int val1 = 0;
			if(firstList!=null){
				val1 = firstList.data;
			}
			int val2 = 0;
			if(secondList!=null){
				val2 = secondList.data;
			}
			int sum = carry + val1 + val2;
			int digit = sum%10;
			ListNode ans = new ListNode(digit);
			carry = sum/10;
			if(head == null){
				head = ans;
			}
			if(prev!=null){
				prev.next = ans;
			}
			prev = ans;
			if(firstList != null){
				firstList=firstList.next;
			}
			if(secondList != null){
				secondList = secondList.next;
			}
		}
		if(carry > 0) {
			ListNode extraNode = new ListNode(carry);
			prev.next = extraNode;
		}
		
		return head;
	}
}
