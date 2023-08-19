package Queue;

public class QueueArray {
    private int[] array;
    private int topOfQueue;
    private int beginningOfQueue;

    public QueueArray(int size) {
        this.array = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("Created queue successfully with size : " + size);
    }

    public boolean isFull() {
        return topOfQueue == array.length - 1;
    }

    public boolean isEmpty() {
        return beginningOfQueue == -1 || beginningOfQueue == array.length;
    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        } else if (isEmpty()) {
            this.beginningOfQueue = 0;
        }
        this.topOfQueue++;
        array[topOfQueue] = value;
        System.out.println("SuccessFully Inserted :" + value);
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            int result = this.array[beginningOfQueue];
            this.beginningOfQueue++;
            if (this.beginningOfQueue > this.topOfQueue) {
                this.beginningOfQueue = this.topOfQueue = -1;
            }
            return result;
        }
    }

    public int peek(){
        if(!isEmpty()){
            return array[this.beginningOfQueue];
        }
        else {
            return -1;
        }
    }
}
