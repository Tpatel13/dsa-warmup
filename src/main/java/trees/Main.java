package trees;

public class Main {
    public static void main(String[] args) {
//        TreeNode drinks = new TreeNode("Drinks");
//        TreeNode hot = new TreeNode("hot");
//        TreeNode cold = new TreeNode("cold");
//
//        TreeNode tea = new TreeNode("Tea");
//        TreeNode wine = new TreeNode("wine");
//        cold.addChild(wine);
//        hot.addChild(tea);
//        drinks.addChild(hot);
//        drinks.addChild(cold);
//
//
//        System.out.println(drinks.children.get(1).children.get(0).data);
//
//        System.out.println(drinks.print(1));

        BinaryTreeLL treeLL = new BinaryTreeLL();
        treeLL.insert("1");
        treeLL.insert("2");
        treeLL.insert("3");
        treeLL.insert("4");
        treeLL.insert("5");
        treeLL.insert("6");

        treeLL.levelOrder();
        System.out.println(" ");
        System.out.println("++");

        treeLL.deleteNodeByString("3");

        treeLL.levelOrder();

//        BinaryNode n1 = new BinaryNode();
//        n1.value = "N1";
//        BinaryNode n2 = new BinaryNode();
//        n2.value = "N2";
//        BinaryNode n3 = new BinaryNode();
//        n3.value = "N3";
//        BinaryNode n4 = new BinaryNode();
//        n4.value = "N4";
//        BinaryNode n5 = new BinaryNode();
//        n5.value = "N5";
//        BinaryNode n6 = new BinaryNode();
//        n6.value = "N6";
//        BinaryNode n7 = new BinaryNode();
//        n7.value = "N7";
//
//        n1.left = n2;
//        n1.right = n3;
//        n2.left = n4;
//        n2.right = n5;
//        n3.right = n7;
//        n3.left = n6;
//
//        treeLL.root = n1;
//
//        treeLL.preOrder(n1);
//        System.out.println(" ");
//        treeLL.inOrder(n1);
//        System.out.println(" ");
//        treeLL.postOrder(n1);
//        System.out.println(" ");
//        treeLL.levelOrder(n1);


    }
}
