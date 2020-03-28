package problem2.traversing;

import problem2.node.TreeNode;

public class Traversal {

    public void printPostorder(TreeNode node) {
        if (node == null)
            return;

        printPostorder(node.getLeft());

        printPostorder(node.getRight());

        System.out.print(node.getData() + " ");
    }

    public void printPreorder() {
    }
}
