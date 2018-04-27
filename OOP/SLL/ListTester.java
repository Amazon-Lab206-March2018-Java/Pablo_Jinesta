// Create a ListTester class to test your methods
public class ListTester {
    public static void main(String[] args) {

        SinglyLinkedList test1 = new SinglyLinkedList();

        System.out.println("Add Nodes to list: 2, 20, 200, 2000, 20000");
        test1.add(2).add(20).add(200).add(2000).add(20000);
        test1.printValues();

        System.out.println("\nRemove a node from the end of list");
        test1.remove();
        test1.printValues();
    }
}

// Compile:
// javac ListTester.java
// java ListTester
// git push origin2 master