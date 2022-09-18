package LinkedList;

import java.util.Scanner;

public class AddAtEnd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linkedlist ls = new Linkedlist();
        ls.addItemAtEnd(1);
        ls.addItemAtEnd(2);
        ls.addItemAtEnd(3);
        ls.addItemAtEnd(4);
        ls.display();
        System.out.println();
        ls.addItemAtBeginning(0);
        ls.display();
        ls.insertElement(3, 20);
        System.out.println();
        ls.display();
        System.out.println();
        System.out.println("Enter Element to Delete:");
        int num = sc.nextInt();
        ls.deleteElement(num);
        ls.display();
        sc.close();
    }
}

class Linkedlist {
    private Node head;
    private Node tail;

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
    }

    public Node findElement(int data) {
        Node temp = this.head;
        while (temp != null) {
            if (temp.getData() == data) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    public void addItemAtEnd(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = this.tail = node;
        } else {
            this.tail.setNext(node);
            this.tail = node;
        }
    }
    
    public void addItemAtBeginning(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = this.tail = node;
        } else {
            node.setNext(this.head);
            this.head = node;
        }
    }
    
    public void insertElement(int previous, int newData) {
        Node node = new Node(newData);
        if (this.head == null) {
            this.head = this.tail = node;
        } else {
            Node nodeBefore = findElement(previous);
            System.out.println(nodeBefore.getData());
            node.setNext(nodeBefore.getNext());
            nodeBefore.setNext(node);
        }
    }
    
    public void deleteElement(int data) {
        if (this.head == null) {
            System.out.println("There is no Data to be deleted");
        }
        else {
            Node temp = this.head;
            Node getNode = findElement(data);
            while (temp != null) {
                if (temp.getNext() == getNode) {
                    Node nodeBefore = temp;
                    nodeBefore.setNext(getNode.getNext());
                }
                temp = temp.getNext();
            }
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

    public Node(int data){
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
    }}
    