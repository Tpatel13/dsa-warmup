package trees;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

    String data;
    List<TreeNode> children;

    public TreeNode(String data) {
        this.data = data;
        this.children = new ArrayList<TreeNode>();
    }

    public void addChild(TreeNode node) {
        this.children.add(node);


    }

    public String print(int level) {
        String ret;
        ret = " ".repeat(level) + data + "\n";

        for (TreeNode child : this.children) {
            ret = ret + child.print(1 + level);
        }
        return ret;
    }
}
