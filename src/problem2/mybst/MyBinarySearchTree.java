package problem2.mybst;

import problem2.node.TreeNode;

import java.util.Queue;

public class MyBinarySearchTree {
    static Queue<TreeNode> queue;

    public TreeNode insert(TreeNode root, int x) {

        if (root == null)
            return new TreeNode(x);

        else if (x > root.getData())
            root.setRight(insert(root.getRight(), x));

        else
            root.setLeft(insert(root.getLeft(), x));

        return root;

    }

    public void inorderRecursion(TreeNode root) {
        if (root.getLeft() != null) {
            inorderRecursion(root.getLeft());
            System.out.println(root.getData());
            inorderRecursion(root.getRight());
        }
    }
}
