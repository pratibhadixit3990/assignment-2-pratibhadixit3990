package problem3.linkedlist;

import problem3.node.Node;
import problem3.student.Student;

public class LinkedList {
    private Node first;
    private Node last;

    public void addLast(Student student) {
        Node newNode = new Node(student);
        if (first == null) {
            first = last = newNode;
            return;
        }

        last.setNext(newNode);
        last = newNode;

        var now = first;
        while (now != null) {
            if (newNode.getData().getRollNo() < now.getData().getRollNo()) {
                var temp = newNode.getData();
                newNode.setData(now.getData());
                now.setData(temp);
            }
            now = now.getNext();
        }
    }

    public void deleteFirst() {
        if (first == null) {
            first = last = null;
            return;
        }
        var sec = first.getNext();
        first.setNext(null);
        first = sec;
    }

    public void display() {
        var now = first;
        while (now != null) {
            System.out.println(now.getData());
            now = now.getNext();
        }
    }

}
