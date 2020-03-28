/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;
// executable class

import problem2.mybst.MyBinarySearchTree;
import problem2.node.TreeNode;
import problem4.myqueue.MyQueue;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyBinarySearchTree objectOfMyBinarySearchTree = new MyBinarySearchTree();

        MyQueue queue = new MyQueue();

        System.out.println("How many nodes you want to totally add in Tree: ");
        int totalNodesOfTree = scanner.nextInt();

        TreeNode objectOfTreeNode = new TreeNode(totalNodesOfTree);

        int newNodeToBeInsertedInTree;

        System.out.println("Statr entering the nodes of the Tree: ");
        for (int i = 0; i < totalNodesOfTree; i++) {
            newNodeToBeInsertedInTree = scanner.nextInt();

            objectOfMyBinarySearchTree.insert(objectOfTreeNode, newNodeToBeInsertedInTree);
        }

        queue.preOrder(objectOfTreeNode);
        System.out.println("Printing the Tree in Pre-Order: ");
        queue.queuePrint(queue);

        System.out.println("Enter the node whose Pre-Order Successor you want to find: ");
        queue.printSuccessor(scanner.nextInt());
    }
}
