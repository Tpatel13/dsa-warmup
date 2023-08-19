package list;

public class SinglyLinkedList {


    private Node head;
    private Node tail;
    private int size;

    public void createLinkedList(int value) {
        Node node = new Node();
        node.setValue(value);
        node.setNext(null);
        head = node;
        tail = node;
        size = 1;
    }

    public void insertNode(int value, int location) {
        Node newNode = new Node();
        newNode.setValue(value);

        if (head == null) {
            System.out.println("Null head Found creating new single-Linked List");
            createLinkedList(value);
            return;
        } else if (location == 0) {
            newNode.setNext(tail);
            this.head.setNext(newNode);
        } else if (location >= size) {
            newNode.setNext(null);
            this.tail.setNext(newNode);
            this.tail = newNode;

        } else {
            Node tempNode = head;

            int counter = 0;
            while (counter < location - 1) {
                tempNode = tempNode.getNext();
                counter++;
            }

            Node nextNode = tempNode.getNext();
            tempNode.setNext(newNode);
            newNode.setNext(nextNode);
        }
        size++;
        System.out.println("Inserted/Updated -> " + value + " at location -> " + location + " updated size -> " + size);
    }

    public void insertNodeAtEnd(int value) {
        insertNode(value, Integer.MAX_VALUE);
    }


    public void traverseAndPrintList() {
        System.out.println("Starting traversing ....");

        System.out.println(" ");
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                System.out.println(tail.getValue());
                break;
            }
            System.out.print(tempNode.getValue() + " |  ");
            tempNode = tempNode.getNext();
        }

        System.out.println(" ");
    }


    public void deleteNode(int value) {

        Node tempNode = this.head;
        if (head.getValue() == value) {
            head = head.getNext();
        }
        Node previousNode = null;
        for (int i = 1; i < size - 1; i++) {

            if (tempNode.getValue() == value) {
                previousNode.setNext(tempNode.getNext());
                break;
            }
            previousNode = tempNode;
            tempNode = tempNode.getNext();
        }

        System.out.println("Updated List :: ");
        traverseAndPrintList();
    }
}