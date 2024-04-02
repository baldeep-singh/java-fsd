package PracticeProject3;
public class Problem7 {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static class DoublyLinkedList {
        Node head;

        void insert(int newData) {
            Node newNode = new Node(newData);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
                newNode.prev = temp;
            }
        }

        void displayForward() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        void displayBackward() {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.prev;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(3);
        list.insert(7);
        list.insert(5);
        list.insert(2);
        System.out.println("Forward traversal:");
        list.displayForward();
        System.out.println("Backward traversal:");
        list.displayBackward();
    }
}
