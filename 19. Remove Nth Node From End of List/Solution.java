class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;
        ListNode node = head;
        int total = 0;
        while (node != null) {
            node = node.next;
            total++;
        } //while
        node = head;
        if (total - n == 0) return head.next;
        for (int i = 0; i < total - n - 1; i++) node = node.next;
        node.next = node.next.next;
        return head;
    } //removeNthFromEnd
} //Solution