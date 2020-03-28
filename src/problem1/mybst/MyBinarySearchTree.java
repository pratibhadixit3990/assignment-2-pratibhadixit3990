/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    TreeNode root;
    int countOfNodesWithoutLeftChild;

    public void insert(int data) {
        TreeNode newTreeNodes = new TreeNode();
        newTreeNodes.setData(data);
        if (root == null) {
            root = newTreeNodes;
        } else {
            TreeNode current = root;
            while (true) {
                if (data > current.getData()) {
                    if (current.getRight() == null) {
                        current.setRight(newTreeNodes);
                        break;
                    } else {
                        current = current.getRight();
                    }
                } else {
                    if (current.getLeft() == null) {
                        current.setLeft(newTreeNodes);
                        break;
                    } else {
                        current = current.getLeft();
                    }
                }
            }
        }
    }

    private void LeftNode(TreeNode root) {
        if (root == null) return;
        else {
            if (root.getLeft() != null) System.out.println(root.getLeft().getData());
            else countOfNodesWithoutLeftChild++;
            LeftNode(root.getLeft());
            LeftNode(root.getRight());
        }
    }

    public void printLeftNode() {
        LeftNode(root);
    }

    public void countNodesWithoutLeftChild() {

    }

}
