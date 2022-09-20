package StackImpl;

public class StackExample {
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        if (stack.push(1)) {
            System.out.println("Elment is pushd");
        }
        else {
            System.out.println("Stack is full");
        }
        if (stack.push(2)) {
            System.out.println("Elment is pushd");
        }
        else {
            System.out.println("Stack is full");
        }
        if (stack.push(3)) {
            System.out.println("Elment is pushd");
        }
        else {
            System.out.println("Stack is full");
        }
        stack.display();
        System.out.println();
        System.out.println("The Top most Element is :"+stack.peek());
        int popped = stack.pop();
        if (popped == Integer.MIN_VALUE) {
            System.out.println("Stack is full");
        }
        else {
            System.out.println("Element popped is:" + popped);
        }
        if (stack.push(3)) {
            System.out.println("Elment is pushd");
        }
        else {
            System.out.println("Stack is full");
        }
        stack.display();
        if (stack.push(4)) {
            System.out.println("Elment is pushd");
        }
        else {
            System.out.println("Stack is full");
        }
        stack.display();
    }
}

class Stack {
    private int top;
    private int max;
    private int[] arr;

    public Stack(int max) {
        this.top = -1;
        this.max = max;
        arr = new int[max];
    }

    public int pop() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        else {
            return arr[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
            return arr[top];
        }
    }

    public boolean push(int data) {
        if (isFull()) {
            return false;
        } else {
            top++;
            arr[top] = data;
            return true;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(+arr[i] + " ");
            }
        }
    }

    public boolean isFull() {
        if (top >= max-1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (top < 0) {
            return true;
        }
        return false;
    }
}