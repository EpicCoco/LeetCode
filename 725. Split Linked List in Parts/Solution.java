public class SplitLinkedListInParts {

	public static void main(String[] args) {
		int[] list = {1, 2, 3, 4};
		ListNode head = makeLinkList(list);
		int k = 5;
		ListNode[] print = splitListToParts(head, k);
		for (ListNode node : print) {
			printList(node);
		} //for
	} //main
	
	public static ListNode[] splitListToParts(ListNode head, int k) {
		ListNode[] toReturn = new ListNode[k];
        if (head == null) return toReturn; //takes care of if there are zero nodes
        ListNode node = head;
        int numNodes = 1;
		while (node.next != null) {
			numNodes++;
			node = node.next;
		} //while
		node = head;
        int nodesPerItem = numNodes / k;
        int remainder = numNodes % k;
        for (int i = 0; i < k; i++) {
        	if (node == null) return toReturn;
        	toReturn[i] = new ListNode(node.val);
        	node = node.next; //BREAK POINT
        	ListNode localHead = toReturn[i];
        	for (int j = 1; j < nodesPerItem + (i < remainder ? 1 : 0); j++) {    
        		localHead.next = new ListNode(node.val);
        		node = node.next;
        		localHead = localHead.next;
        	} //for
        } //for
        return toReturn;
    } //splutListToParts

	public static ListNode makeLinkList(int[] list) {
		if (list.length == 0) return null;
		ListNode head = new ListNode(list[0]);
		ListNode prev = head;
		ListNode next = null;
		for (int i = 1; i < list.length; i++) {
			next = new ListNode(list[i]);
			prev.next = next;
			prev = next;
		} //for
		return head;
	} //makeLinkList
	
	public static void printList(ListNode head) {
		System.out.print("list: ");
		ListNode node = head;
		if (node == null) {
			System.out.println();
			return;
		} //if
		while (node.next != null) {
			System.out.print(node.val + " ");
			node = node.next;
		} //while
		System.out.print(node.val + " ");
		System.out.println();
	} //printList
}
