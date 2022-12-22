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
	void removeLoop(ListNode list) {
	    // add your logic here
		if(list == null || list.next == null){
			return;
		}
		ListNode slow = list.next;
		ListNode prev = list.next;
		ListNode fast = list.next.next;
		while(fast!=null && fast.next!=null){
			if(slow ==  fast){
				slow = list;
				break;
			}
			slow = slow.next;
			prev = fast.next;
			fast = fast.next.next;
		}
		if(fast == null || fast.next == null){
			return;
		}
		while(slow!=fast){
			prev = fast;
			slow = slow.next;
			fast = fast.next;
		}
		prev.next = null;
		return;
	}
}
