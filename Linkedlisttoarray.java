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
	List<Integer> linkedListToArray (ListNode head) {
	    // add your logic here
		List<Integer> ls = new ArrayList<>();
		ListNode current = head;
		while(current!=null){
			ls.add(current.data);
			current=current.next;
		}
		return ls;
	}
}
