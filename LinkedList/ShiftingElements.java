package LinkedList;

import java.util.Scanner;

public class ShiftingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linkedlist ls = new Linkedlist();
        ls.addAtEnd(1);
        ls.addAtEnd(2);
        ls.addAtEnd(3);
        ls.addAtEnd(4);
        ls.addAtEnd(5);
        ls.display();
        System.out.println("Enter the number by which the elements need to shift to right:");
        int num = sc.nextInt();
        ls.shiftElementstoRight(ls, num);
        ls.display();
        sc.close();
    }
}

class Linkedlist {
    private Node head;
    private Node tail;

    public void shiftElementstoRight(Linkedlist ls, int num) {
        if (num == 0) {
            return;
        }
        Node current = this.head;
        int count = 1;
        while (count < num && current != null) {
            current = current.getNext();
            count++;
        }
        Node kthNode = current;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(head);
        head = kthNode.getNext();
        kthNode.setNext(null);
    }

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
    }

    public void addAtEnd(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = this.tail = node;
        }
        else {
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    public Node getHead() {
        return head;
    }
    public void setHead(Node head) {
        this.head = head;
    }
    public Node getTail() {
        return tail;
    }
    public void setTail(Node tail) {
        this.tail = tail;
    }
    
}

class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    
}