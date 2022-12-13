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
	int getMiddleElementOfLinkedList (ListNode list) {
	    // add your logic here
		ListNode current = list;
		int count = 0;
		while(current!=null){
			count++;
			current=current.next;
		}
		int mid = count/2;
		if(count%2==0){
			mid--;
		}
		current = list;
		int i = 0;
		while(mid!=i){
			i++;
			current = current.next;
		}
		return current.data;
	}
}
