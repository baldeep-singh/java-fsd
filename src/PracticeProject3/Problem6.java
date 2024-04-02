package PracticeProject3;
public class Problem6 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class CircularLinkedList {
        Node head;

        CircularLinkedList() {
            head = null;
        }

        void insert(int newData) {
            Node newNode = new Node(newData);
            if (head == null) {
                newNode.next = newNode;
                head = newNode;
            } else if (head.data >= newNode.data) {
                Node last = getLastNode();
                newNode.next = head;
                last.next = newNode;
                head = newNode;
            } else {
                Node current = head;
                while (current.next != head && current.next.data < newNode.data) {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
            }
        }

        Node getLastNode() {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            return temp;
        }

        void display() {
            Node current = head;
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
        }
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(3);
        list.insert(7);
        list.insert(5);
        list.insert(2);
        System.out.println("Sorted Circular Linked List:");
        list.display();
    }
}
