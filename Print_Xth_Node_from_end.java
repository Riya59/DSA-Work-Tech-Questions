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
	ListNode xthNodeFromEnd(ListNode head, int x) {
		// add your logic here
		ListNode current = head;
		int len = 0;
		while(current!=null){
			len++;
			current = current.next;
		}
		if(len<x){
			return head;
		}
		current = head;
		for(int i=1;i<len-x+1;i++){
			current = current.next;
		}
		return current;
	}
}
