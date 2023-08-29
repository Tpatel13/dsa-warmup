package trees;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

    String data;
    List<TreeNode> children;

    public TreeNode(String data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode node) {
        this.children.add(node);
    }

    public String print(int level) {
        StringBuilder ret;
        ret = new StringBuilder(" ".repeat(level) + data + "\n");

        for (TreeNode child : this.children) {
            ret.append(child.print(1 + level));
        }
        return ret.toString();
    }
}
