import java.util.*;

import javax.xml.transform.sax.TemplatesHandler;

// Create a SinglyLinkedList class with the head attribute

public class SinglyLinkedList {
    private Node head;

    // Create a constructor method that sets the head to null of your SinglyLinkedList objects
    public SinglyLinkedList() {
        head = null;
    }

    // Create a add(int) method that will add a node to the end of your list with the value in the parameter
    public SinglyLinkedList add(int nextNode) {

        Node addNode = new Node(nextNode);

        // If head is null...
        if (head == null) {
            head = addNode;
            return this;
        }
        Node temp = head;

        // But if head is not null...
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(addNode);
        return this;
    }

    // Create a remove() method that will remove a node from the end of your list
    public SinglyLinkedList remove() {

        // If head is null...
        if (head == null) {
            return this;
        }
        Node temp = head;

        // But if head is not null...
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(null);
        return this;
    }

    // Create printValues() method that will print all the values of each node in the list in order
    public void printValues() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }

}