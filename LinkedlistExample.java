import java.util.LinkedList;

public class LinkedlistExample {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> fruits = new LinkedList<>();

        // Add elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Print the LinkedList
        System.out.println("Fruits: " + fruits);

        // Add element at first and last position
        fruits.addFirst("Strawberry");
        fruits.addLast("Pineapple");

        // Remove an element
        fruits.remove("Banana");

        // Access an element
        System.out.println("First fruit: " + fruits.getFirst());
        System.out.println("Last fruit: " + fruits.getLast());

        // Print final list
        System.out.println("Updated Fruits: " + fruits);
    }
}

    

