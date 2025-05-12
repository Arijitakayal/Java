import java.util.*;

public class Graph {
    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    // Add edge (undirected)
    public void addEdge(int u, int v) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u);  // For undirected graph
    }

    // Print the graph
    public void printGraph() {
        for (int node : adjList.keySet()) {
            System.out.print(node + " -> ");
            for (int neighbor : adjList.get(node)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();

        // Add some edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Print the graph
        System.out.println("Adjacency List of Graph:");
        graph.printGraph();
    }
}

    

