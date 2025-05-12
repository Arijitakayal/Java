import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        // PriorityQueue keeps elements in natural order (min-heap)
        System.out.println("Priority Queue: " + pq);

        // Peek and remove elements
        System.out.println("Top Element (Peek): " + pq.peek());
        System.out.println("Removed: " + pq.poll());

        System.out.println("After Removal: " + pq);
    }
}

    

