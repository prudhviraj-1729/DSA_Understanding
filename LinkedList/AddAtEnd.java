package LinkedList;

public class AddAtEnd {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addAtEnd("America");
        list.addAtEnd("India");
        list.addAtEnd("Japan");
        list.addAtEnd("korea");
    }
}

class Node {
    private String Data;
    private Node next;

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class LinkedList {
    private Node head;
    private Node tail;

    public void addAtEnd(String string) {
        //Create a new node
        Node node = new Node();
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
