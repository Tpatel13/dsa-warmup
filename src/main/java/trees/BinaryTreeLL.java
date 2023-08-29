package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL() {
        root = null;
    }


    // Pre-order Traversal
    void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    void levelOrder(BinaryNode node) {
        if (node == null) return;

        Queue<BinaryNode> binaryNodeQueue = new LinkedList<>();
        binaryNodeQueue.add(root);
        while (!binaryNodeQueue.isEmpty()) {
            BinaryNode currentElement = binaryNodeQueue.remove();
            System.out.print(currentElement.value + " ");

            if (currentElement.left != null) {
                binaryNodeQueue.add(currentElement.left);
            }
            if (currentElement.right != null) {
                binaryNodeQueue.add(currentElement.right);
            }
        }
    }

    void levelOrder() {

        Queue<BinaryNode> binaryNodeQueue = new LinkedList<>();
        binaryNodeQueue.add(root);
        while (!binaryNodeQueue.isEmpty()) {
            BinaryNode currentElement = binaryNodeQueue.remove();
            System.out.print(currentElement.value + " ");

            if (currentElement.left != null) {
                binaryNodeQueue.add(currentElement.left);
            }
            if (currentElement.right != null) {
                binaryNodeQueue.add(currentElement.right);
            }
        }
    }

    void insert(String value) {
        if (value == null || value.length() == 0) return;

        BinaryNode node = new BinaryNode();
        node.value = value;
        if (this.root == null) {
            this.root = node;
            return;
        }

        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();

            if (presentNode.left == null) {
                presentNode.left = node;
                break;
            } else if (presentNode.right == null) {
                presentNode.right = node;
                break;
            } else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }


    public BinaryNode deepestNode() {
        if (root.right == null && root.left == null) return root;

        Queue<BinaryNode> binaryNodeQueue = new LinkedList<>();
        binaryNodeQueue.add(root);
        BinaryNode lastNode = null;

        while (!binaryNodeQueue.isEmpty()) {
            lastNode = binaryNodeQueue.remove();

            if (lastNode.left != null) {
                binaryNodeQueue.add(lastNode.left);

            }
            if (lastNode.right != null) {
                binaryNodeQueue.add(lastNode.right);
            }
        }
        return lastNode;
    }

    public BinaryNode deleteDeepestNode() {
        Queue<BinaryNode> binaryNodeQueue = new LinkedList<>();
        binaryNodeQueue.add(root);
        BinaryNode deepestNode = null;
        BinaryNode previousNode, presentNode = null;
        while (!binaryNodeQueue.isEmpty()) {
            previousNode = presentNode;
            presentNode = binaryNodeQueue.remove();

            if (presentNode.left == null) {
                deepestNode = previousNode.right;
                previousNode.right = null;
                break;
            } else if (presentNode.right == null) {
                deepestNode = presentNode.left;
                presentNode.left = null;
                break;
            }
            binaryNodeQueue.add(presentNode.left);
            binaryNodeQueue.add(presentNode.right);
        }
        return deepestNode;
    }

    // Delete Given Node
    public void deleteNodeByString(String value) {
        // First Delete last node
        BinaryNode lastNode = deleteDeepestNode();

        if (lastNode.value.equals(value)) return;

        // Find Given node in Tree
        Queue<BinaryNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode tempNode = queue.remove();
            if (tempNode.value.equals(value)) {
                tempNode.value=lastNode.value;
//                BinaryNode LeftNode = tempNode.left;
//                BinaryNode rightNode = tempNode.right;
//                lastNode.left = LeftNode;
//                lastNode.right = rightNode;
                break;
            }
            if (tempNode.left != null) queue.add(tempNode.left);
            if (tempNode.right != null) queue.add(tempNode.right);

        }
    }

}
