/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyBinarySearchTree objectOfMyBinarySearchTree = new MyBinarySearchTree();

        System.out.println("How many total nodes you want to insert in Tree: ");
        int totalNumberOfNodesToBeInserted = scanner.nextInt();

        int newNodeInserted;

        for (int i = 0; i < totalNumberOfNodesToBeInserted; i++) {
            newNodeInserted = scanner.nextInt();
            objectOfMyBinarySearchTree.insert(newNodeInserted);
        }
    }
}
