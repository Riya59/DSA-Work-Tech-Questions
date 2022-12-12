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
	ListNode appendLists (ListNode list1, ListNode list2) {
	    // add your logic here
		ListNode current1 = list1;
		while(current1.next != null){
			current1 = current1.next;
		}
		current1.next = list2;
		return list1;
		
	}
}
