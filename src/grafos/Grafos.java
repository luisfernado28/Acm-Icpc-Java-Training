package grafos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Grafos {

	
	/**
	 * The graph is represented by an Adjacency list, the way to do this is to
	 * define an ArrayList of ArrayLists of the Nodes of the graph (in this case
	 * Integers) It is static because we need this to be available for the main,
	 * BFS and the DFS methods
	 */
	static ArrayList<ArrayList<Integer>> graph;
	/**
	 * Then we have an ArrayList of Boolean values which represent the visited
	 * Nodes when we perform the DFS traversal, you can replace this by a common
	 * Array and it should still work! It is static because we need this to be
	 * available for the main, BFS and the DFS methods
	 */
	static ArrayList<Boolean> visited;
	/**
	 * The parents ArrayList will contain the BFS shortest walk from the start
	 * Node to all the other reachable nodes It is static because we need this
	 * to be available for both the main and the BFS methods
	 */
	static ArrayList<Integer> parents;

	public static void main(String[] args) {

		/**
		 * Sample input
		 *  5
			6
			0 2
			0 1
			2 1
			2 3
			3 4
			4 1
		 */
		
		Scanner in = new Scanner(System.in);
		/**
		 * n is the number of nodes that will be contained by the graph
		 */
		int n = in.nextInt();
		/**
		 * edges are the number of connections between the graph nodes
		 */
		int edges = in.nextInt();
		/**
		 * Initializing the graph, visited and parents ArrayLists
		 */
		graph = new ArrayList<>();
		visited = new ArrayList<>();
		parents = new ArrayList<>();
		/**
		 * Adding the Nodes to the graph, initializing the visited ArrayList
		 * with value false for each node and initializing the parents ArrayList
		 * with value -1 (this represents that the node has no parent for this
		 * traversal or is the start node)
		 */
		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<Integer>());
			visited.add(false);
			parents.add(-1);
		}
		/**
		 * Build up the adjacency list while reading the edges Don't forget that
		 * an edge is an ordered pair in form (from, to) 
		 * a {int} - Represents the node from 
		 * b {int} - Represents the node to
		 */
		for (int i = 0; i < edges; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			graph.get(a).add(b);
			graph.get(b).add(a);

		}
		/**
		 * This prints the graph adjacency representation, uncomment it to see
		 * the represantation on the standard output
		 */
		// for(int i=0;i<graph.size();i++){
		// System.out.print(i+"->");
		// for(int j=0;j<graph.get(i).size();j++){
		// System.out.print(graph.get(i).get(j)+" ");
		// }
		// System.out.println();
		// }
		BFS(0);
		
	}

	/**
	 * Here we perform the DFS algorithm, the stack will be created by the
	 * recursive call, the traversal will be printed to the standard output. For
	 * a better explanation on how recursion works, please search for examples
	 * on Internet or ask someone to explain this to you
	 * 
	 * @param c {int} - The starting node
	 */
	public static void DFS(int c) {
		visited.set(c, true);
		System.out.print(c + ",");
		for (int i = 0; i < graph.get(c).size(); i++) {
			if (!visited.get(graph.get(c).get(i))) {
				DFS(graph.get(c).get(i));
			}
		}
	}

	/**
	 * Performs the BFS algorithm and prints the traversal to the standard
	 * output
	 * 
	 * @param s {int} - the starting node
	 */
	public static void BFS(int s) {
		LinkedList<Integer> queue = new LinkedList<>();
		queue.offer(s);
		visited.set(s, true);
		System.out.print(s + ",");
		while (!queue.isEmpty()) {
			int node = queue.poll();
			for (int i = 0; i < graph.get(node).size(); i++) {
				if (!visited.get(graph.get(node).get(i))) {
					queue.offer(graph.get(node).get(i));
					visited.set(graph.get(node).get(i), true);
					parents.set(graph.get(node).get(i), node);
					System.out.print(graph.get(node).get(i) + ",");
				}
			}
		}
	}
}
