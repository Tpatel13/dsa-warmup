package list;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList=new SinglyLinkedList();

        singlyLinkedList.createSingleLinkedList(1);

        singlyLinkedList.insertNode(1,1);
        singlyLinkedList.insertNode(10,2);
        singlyLinkedList.insertNode(2,3);
        singlyLinkedList.insertNode(11,4);


        singlyLinkedList.insertNode(20,3);

        singlyLinkedList.traverseLinkedList();

    }
}
