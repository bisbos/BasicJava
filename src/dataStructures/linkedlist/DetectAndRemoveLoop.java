package dataStructures.linkedlist;

//https://www.youtube.com/watch?v=_BG9rjkAXj8

/**
 * 1) Detect Loop using Floyd’s Cycle detection algo and get the pointer to a loop node.
 * 2) Count the number of nodes in loop. Let the count be k.
 * 3) Fix one pointer to the head and another to kth node from head.
 * 4) Move both pointers at the same pace, they will meet at loop starting node.
 * 5) Get pointer to the last node of loop and make next of it as NULL.
 */
public class DetectAndRemoveLoop {

    Link head;
    int count =0;

    public static void main(String[] args) {

        DetectAndRemoveLoop list = new DetectAndRemoveLoop();
        list.head = new Link(50);
        list.head.next = new Link(20);
        list.head.next.next = new Link(15);
        list.head.next.next.next = new Link(4);
        list.head.next.next.next.next = new Link(10);

        // Creating a loop for testing
        list.head.next.next.next.next.next = list.head.next.next;
        list.detectAndRemoveLoop(list.head);
        System.out.println("Linked List after removing loop : ");
        list.printList(list.head);

    }

    // Function that detects loop in the list
    int detectAndRemoveLoop(Link node) {
        Link slow = node, fast = node;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast meet at same point then loop is present
            if (slow == fast) {
                removeLoop(slow, node);
                return 1;
            }
        }
        return 0;
    }

    // Function to remove loop
    void removeLoop(Link loop, Link head) {

        //Create two pointers pointing to the loop
        Link ptr1 = loop;
        Link ptr2 = loop;

        // Count the number of nodes in loop
        int k = 1, i;
        while (ptr1.next != ptr2) {
            ptr1 = ptr1.next;
            k++;
        }

        // Fix one pointer to head
        ptr1 = head;

        // And the other pointer to k nodes after head
        ptr2 = head;
        for (i = 0; i < k; i++) {
            ptr2 = ptr2.next;
        }

        /*  Move both pointers at the same pace,
         they will meet at loop starting node */
        while (ptr2 != ptr1) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        // Get pointer to the last node
        ptr2 = ptr2.next;
        while (ptr2.next != ptr1) {
            ptr2 = ptr2.next;
        }

        /* Set the next node of the loop ending node
         to fix the loop */
        ptr2.next = null;
    }

    // Function to print the linked list
    void printList(Link node) {
        while (node != null) {
            System.out.print(node.element + " ");
            node = node.next;
        }
    }


}
