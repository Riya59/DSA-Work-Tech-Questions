class Solution {
	ListNode getMid(ListNode head) {
		ListNode slowPtr = head;
		ListNode fastPtr = head.next.next;
		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
	}
	ListNode merge(ListNode firstHalf, ListNode secondHalf) {
		ListNode mergedList;
		if (firstHalf.data < secondHalf.data) {
			mergedList = firstHalf;
			firstHalf = firstHalf.next;
		} else {
			mergedList = secondHalf;
			secondHalf = secondHalf.next;
		}
		ListNode currentNode = mergedList;
		while (firstHalf != null && secondHalf != null) {
			if (firstHalf.data < secondHalf.data) {
				currentNode.next = firstHalf;
				firstHalf = firstHalf.next;
			} else {
				currentNode.next = secondHalf;
				secondHalf = secondHalf.next;
			}
			currentNode = currentNode.next;
		}
		while (firstHalf != null) {
			currentNode.next = firstHalf;
			firstHalf = firstHalf.next;
			currentNode = currentNode.next;
		}
		while (secondHalf != null) {
			currentNode.next = secondHalf;
			secondHalf = secondHalf.next;
			currentNode = currentNode.next;
		}
		return mergedList;
	}
	ListNode mergeSort(ListNode head) {
		if (head.next == null) {
			return head;
		}
		ListNode midNode = getMid (head);
		ListNode secondHalf = mergeSort(midNode.next);
		midNode.next = null;
		ListNode firstHalf = mergeSort(head);
		return merge(firstHalf, secondHalf);
	}
}
