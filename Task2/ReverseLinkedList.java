public class ReverseLinkedList {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        Integer headArray[] = {1, 2, 2, 3, 4, 5};
        
        // Create the linked list from the array
        ListNode head = createLinkedList(headArray);
        
        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);
        
        // Reverse the linked list
        ListNode reversedHead = reverseList(head);
        
        // Print the reversed linked list
        System.out.print("Reversed Linked List: ");
        printLinkedList(reversedHead);
    }
    
    // Method to create a linked list from an array
    public static ListNode createLinkedList(Integer[] array) {
        if (array.length == 0) return null;
        
        ListNode head = new ListNode(array[0]);
        ListNode current = head;
        
        for (int i = 1; i < array.length; i++) {
            current.next = new ListNode(array[i]);
            current = current.next;
        }
        
        return head;
    }

    // Method to print a linked list
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to reverse a linked list (recursive)
    public static ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }

    private static ListNode reverse(ListNode current, ListNode prev) {
        if (current == null) {
            return prev;
        }
        ListNode next = current.next;
        current.next = prev;
        return reverse(next, current);
    }
}
