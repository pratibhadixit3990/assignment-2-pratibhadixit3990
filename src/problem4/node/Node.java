package problem4.node;

import problem2.node.TreeNode;

public class Node {
    private Node next;
    private TreeNode node;

    public Node(int data) {
        node = new TreeNode(data);
        next = null;
    }
}
