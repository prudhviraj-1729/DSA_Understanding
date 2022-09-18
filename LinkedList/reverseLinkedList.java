package LinkedList;

public class reverseLinkedList {
    public static void main(String[] args) {
        Linkedlist ls = new Linkedlist();
        ls.addAtEnd(1);
        ls.addAtEnd(2);
        ls.addAtEnd(3);
        ls.addAtEnd(4);
        ls.display();
        ls.reverse(ls);
        System.out.println();
        System.out.println("After reversing the list");
        ls.display();
    }
}

class Linkedlist {
    private Node head;
    private Node tail;

    public void reverse(Linkedlist ls) {
        Node prev = null;
        Node current = this.head;
        Node next = null;
        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        this.head = prev;
    }

    public void display() {
        Node temp = this.head;
        while(temp != null){
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
