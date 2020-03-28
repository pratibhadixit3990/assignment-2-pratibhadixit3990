/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.Scanner;

//executable class
public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyCircularQueue objectOfMyCircularQueue = new MyCircularQueue();

        System.out.println("Enter the size for circular queue: ");
        int size = scanner.nextInt();

        int array[] = new int[size];

        int count = 0;
        String studentName = "";
        int backLogs;
        for (int i = 0; i < size; i++) {
            scanner.nextLine();
            System.out.println("Enter the name of the Student: ");
            studentName = scanner.nextLine();
            System.out.println("Enter thew number of Backlogs of the Student: ");
            backLogs = scanner.nextInt();

            Student student = new Student(studentName, backLogs);
            objectOfMyCircularQueue.enqueue(student);
        }

        System.out.println();
        System.out.println("Total number of students: " + objectOfMyCircularQueue.getSize());
        System.out.println("Number of student/students having zero(0) backlogs: " + objectOfMyCircularQueue.remove());
        System.out.println("Number of student/students having atleast ont(1) or more backlogs: " + (objectOfMyCircularQueue.getSize() - objectOfMyCircularQueue.remove()));
    }
}
