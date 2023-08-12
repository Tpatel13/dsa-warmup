package list;

import java.sql.SQLOutput;

public class SinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return node;
    }


    public void insertNode(int nodeValue, int location) {
        Node newNode = new Node();

        newNode.value = nodeValue;

        if (head == null) {
            createSingleLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;

        } else {


            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }

            Node nextNode = tempNode.next;
            tempNode.next = newNode;
            newNode.next = nextNode;

        }
        size++;
    }

    //Single linked list traversal

    public void traverseLinkedList() {
        if (head == null) {
            System.out.println("Empty Linked List");
        } else {
            Node tempNode = head;
            int counter = 0;
            while (counter < size - 1) {
                System.out.println(tempNode.value);
                tempNode = tempNode.next;
                counter++;
            }
        }

    }
}
