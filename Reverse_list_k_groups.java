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
	ListNode reverseLinkedListKGroup(ListNode head, int k) {
		ListNode currentNode = head;
		int totalNodes = 0;
		while (currentNode != null && totalNodes < k) {
			currentNode = currentNode.next;
			totalNodes++;
		}
		if (totalNodes < k) {
			return head;
		}
		currentNode = head;
		ListNode prevNode = null;
		ListNode nextNode = null;
		int nodeCount = 0;
		while (nodeCount < k) {
			nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
			nodeCount++;
		}
		head.next = reverseLinkedListKGroup(nextNode, k);
		return prevNode;
	}
}
