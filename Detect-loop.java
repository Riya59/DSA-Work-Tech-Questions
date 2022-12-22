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
	ListNode getStartingNodeOfLoop(ListNode list){
		// add your logic here
		if(list.next == null){
			return null;
		}
		ListNode slow = list.next;
		ListNode fast = list.next.next;
		while(fast!=null && fast.next!=null){
			if(slow == fast){
				slow = list;
				break;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast==null || fast.next==null){
			return null;
		}
		while(slow!=fast){
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
}
