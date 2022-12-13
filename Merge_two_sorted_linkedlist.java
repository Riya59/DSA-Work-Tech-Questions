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
	ListNode mergeTwoSortedList (ListNode firstList, ListNode secondList) {
	    // add your logic here
		ListNode temp;
		if(firstList.data > secondList.data){
			temp = firstList;
			firstList = secondList;
			secondList = temp;
		}
		ListNode head = firstList;
		ListNode prev = firstList;
		while(firstList!=null && secondList!=null){
			if(firstList.data > secondList.data){
				prev.next = secondList;
				temp = firstList;
				firstList = secondList;
				secondList = temp;
			}
			prev = firstList;
			firstList = firstList.next;
		}
		prev.next = secondList;
		return head;
	}
}
