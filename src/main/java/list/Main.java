package list;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.createLinkedList(1);

        singlyLinkedList.insertNode(2, 10);
        singlyLinkedList.insertNode(3, 2);
        singlyLinkedList.insertNode(4, 3);
        singlyLinkedList.insertNode(5, 4);
        singlyLinkedList.insertNode(6, 5);
        singlyLinkedList.insertNode(6, Integer.MAX_VALUE);
        singlyLinkedList.insertNode(7, 6);

        singlyLinkedList.traverseAndPrintList();
        singlyLinkedList.deleteNode(5);

    }

}
