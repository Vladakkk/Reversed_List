public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        Solution.printList(head1);

        ListNode reversedHead1 = solution.reverseList(head1);
        System.out.println("\nReversed List:");
        Solution.printList(reversedHead1);

        // Example 2
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        System.out.println("\nOriginal List:");
        Solution.printList(head2);

        ListNode reversedHead2 = solution.reverseList(head2);
        System.out.println("\nReversed List:");
        Solution.printList(reversedHead2);

        // Example 3
        ListNode head3 = null;

        System.out.println("\nOriginal List:");
        Solution.printList(head3);

        ListNode reversedHead3 = solution.reverseList(head3);
        System.out.println("\nReversed List:");
        Solution.printList(reversedHead3);
    }
}
