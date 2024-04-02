package PracticeProject3;
public class Problem5{
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode deleteFirstOccurrence(ListNode head, int key) {
        if (head == null) return null;
        if (head.val == key) return head.next;

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null && curr.val != key) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            prev.next = curr.next;
        }

        return head;
    }

    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print original linked list
        System.out.println("Original linked list:");
        printLinkedList(head);

        // Delete the first occurrence of key = 3
        head = deleteFirstOccurrence(head, 3);

        // Print linked list after deletion
        System.out.println("\nLinked list after deleting first occurrence of key 3:");
        printLinkedList(head);
    }

    // Helper method to print the linked list
    private static void printLinkedList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
