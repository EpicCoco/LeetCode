import java.util.concurrent.TimeUnit;

//https://leetcode.com/problems/linked-list-cycle/description/
public class LinkedListCycle {

	public static void main(String[] args) {
		
		int[] list = {3,2,0,-4};
		ListNode head = makeLinkList(list, 1);
		//printList(head);
		System.out.println(hasCycle(head));
	} //main
	
	/**
	 * Definition for singly-linked list.
	 * class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */
	public static boolean hasCycle(ListNode head) {
		if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        boolean swap = false;
        while (fast != null && fast.next != null) {
        	if (fast == slow) return true;
        	fast = fast.next;
        	if (swap) slow = slow.next;
        	swap = !swap;
        } //while
		return false;
    } //hasCycle
	
	public static ListNode makeLinkList(int[] list, int pos) {
		ListNode head = new ListNode(list[0]);
		ListNode prev = head;
		ListNode next = null;
		ListNode loopSave = null;
		for (int i = 1; i < list.length; i++) {
			next = new ListNode(list[i]);
			if (i == pos) {
				loopSave = next;
			} //if
			prev.next = next;
			prev = next;
		} //for
		prev.next = loopSave;
		return head;
	} //makeLinkList
	
	public static void printList(ListNode head) {
		System.out.print("list: ");
		ListNode node = head;
		while (node.next != null) {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(node.val + " ");
			node = node.next;
		} //while
	} //printList
	
} //LinkedListCycle
