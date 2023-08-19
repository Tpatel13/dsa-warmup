package Queue;

import javax.swing.*;

public class CircularQueue {
    private int[] arr;
    private int topOfQueue;
    private int beginningOfQueue;
    private int size;

    public CircularQueue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("Created queue created with size of " + size);
    }


    public boolean isEmpty() {
        return topOfQueue == -1;
    }

    public boolean isFull() {
        return ((topOfQueue + 1) == beginningOfQueue)
                || (this.beginningOfQueue == 0 && this.topOfQueue + 1 == this.size);
    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full ");
            return;
        } else if (isEmpty()) {
            this.beginningOfQueue = 0;
            this.topOfQueue++;
            arr[topOfQueue] = value;
        } else {
            if (this.topOfQueue + 1 == size) {
                topOfQueue = 0;
            } else {
                topOfQueue++;
            }
            arr[topOfQueue] = value;
        }
        System.out.println(value + " successfully inserted ");
    }

    // Get first element from queue
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int result = this.arr[beginningOfQueue];
            this.arr[beginningOfQueue] = Integer.MIN_VALUE;
            if (this.beginningOfQueue == this.topOfQueue) {
                this.beginningOfQueue = this.topOfQueue = -1;
            } else if (this.beginningOfQueue + 1 == this.size) {
                beginningOfQueue = 0;
            } else {
                beginningOfQueue++;
            }
            return result;
        }
    }


    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            return this.arr[this.beginningOfQueue];
        }
    }


}
