package trees;

public class BinaryTreeArr {
    String[] arr;
    int lastUsedIndex;

    public BinaryTreeArr(int size) {
        this.arr = new String[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("Tree of size " + size + " is created");
    }

    public boolean isFull() {
        return lastUsedIndex == arr.length - 1;
    }

    public void insert(String value) {
        if (!isFull()) {
            arr[lastUsedIndex + 1] = value;
            lastUsedIndex++;
            System.out.println("Inserted at : " + (lastUsedIndex - 1) + " location");
        } else {
            System.out.println("Binary tree is full");
        }
    }

    public void levelOrderTraverse(){

    }

//    public void preOrder(int lastUsedIndex)
//    {
//        if(lastUsedIndex)
//    }
}
