/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.student.Student;

import java.util.Scanner;

// executable class
public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyPriorityQueue objectOfMyPriorityQueue = new MyPriorityQueue();

        System.out.println("Total number of students you want to enter");
        int totalNumberOfStudents = scanner.nextInt();
        scanner.nextLine();

        String nameOfStudent;
        int rollNumberOfStudent;
        System.out.println("Enter the student's data: ");
        for (int i = 0; i < totalNumberOfStudents; i++) {
            System.out.print("Name of student: ");
            nameOfStudent = scanner.nextLine();
            System.out.print("Roll Number of student: ");
            rollNumberOfStudent = scanner.nextInt();
            scanner.nextLine();

            objectOfMyPriorityQueue.enqueue(new Student(nameOfStudent, rollNumberOfStudent));

        }

        System.out.println("Students in the order of their increasing roll numbers: ");
        objectOfMyPriorityQueue.print();
    }
}
