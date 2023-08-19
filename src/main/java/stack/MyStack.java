package stack;

public class MyStack {
    int[] arr;
    int topOfStack;

    public MyStack(int size) {
        arr = new int[size];
        topOfStack = -1;
        System.out.println("Stack created with size :: " + size);
    }

    public boolean isEmpty() {
        return topOfStack == -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            arr[topOfStack + 1] = value;
            System.out.println("The value is inserted at location +" + topOfStack);
            topOfStack++;
        }
    }

    public boolean isFull() {
        return topOfStack == arr.length;
    }


    public int pop() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return Integer.MIN_VALUE;
        } else {
            int topStack = arr[topOfStack];
            topStack--;
            return topStack;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return Integer.MIN_VALUE;
        } else {
            return arr[topOfStack];
        }
    }

}
