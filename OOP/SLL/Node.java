// Create a Node class with the value and next attributes

public class Node {
    private int value;
    private Node next;

    // Create a constructor method that sets the value to a given number and next to null of your Node objects
    public Node(int num) {
        value = num;
        next = null;

    }

    // Get Next Node
    public Node getNext() {
        return next;
    }

    // Set Next Node
    public void setNext(Node nextNode) {
        next = nextNode;
    }

    // Get All Values. Print all the values of each node in the list in order
    public int getValue() {
        return value;
    }

    // Implement a find(int) method that will return the first node with the value in the parameter
    public int find(int findNode) {
        return value;
    }
}