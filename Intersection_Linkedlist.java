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
	ListNode getIntersectionNode(ListNode A, ListNode B) {
		// add your logic here
	    while(B!=null){
			ListNode temp = A;
			while(temp!=null){
				if(temp == B){
					return B;
				}
				temp = temp.next;
			}
			B = B.next;
		}
	return null;
	}
}
