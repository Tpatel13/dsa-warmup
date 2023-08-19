package trees;

public class Main {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("hot");
        TreeNode cold = new TreeNode("cold");

        TreeNode tea = new TreeNode("Tea");
        TreeNode wine = new TreeNode("wine");
        cold.addChild(wine);
        hot.addChild(tea);
        drinks.addChild(hot);
        drinks.addChild(cold);


        System.out.println(drinks.children.get(1).children.get(0).data);

        System.out.println(drinks.print(1));
    }
}
