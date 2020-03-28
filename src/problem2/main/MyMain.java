/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem2.mybst.MyBinarySearchTree;
import problem2.node.TreeNode;
import problem2.traversing.Traversal;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Traversal objectOfTraversal = new Traversal();
        MyBinarySearchTree objectOfMyBinarySearchTree = new MyBinarySearchTree();

        System.out.println("How many total nodes you want to enter in the Tree: ");
        int totalNodesToBeEntered = scanner.nextInt();

        TreeNode objectOfTreeNode = new TreeNode(totalNodesToBeEntered);

        System.out.println("Insert the nodes of the Tree: ");
        for (int i = 0; i < totalNodesToBeEntered; i++) {
            objectOfMyBinarySearchTree.insert(objectOfTreeNode, scanner.nextInt());
        }
    }
}
