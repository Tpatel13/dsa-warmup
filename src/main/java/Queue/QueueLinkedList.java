package Queue;

public class QueueLinkedList {
    private boolean isEmpty;
    private Node beginning;
    private Node end;

    public QueueLinkedList() {
    }

    private boolean isEmpty() {
        return this.isEmpty;
    }

    //Attach new node in queue
    public void enQueue(int value) {


        Node newNode = new Node(value);

        if (this.beginning == null) {
            this.end = this.beginning = newNode;
            return;
        }

        this.end.next = newNode;
        this.end = newNode;
    }

    public int deQueue() {
        if (this.beginning == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int returnValue = this.beginning.value;
        this.beginning = this.beginning.next;

        return returnValue;
    }
}
