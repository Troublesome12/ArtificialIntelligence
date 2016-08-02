public class Main {

	public static void main(String[] args) {
		Graph graph = new Graph(22);		//number of total nodes is sent as argument
		
        Node node = new Node(0, new int[] {1, 2, 3});
        graph.addNode(node);
        
        node = new Node(1, new int[] {0, 4, 5});
        graph.addNode(node);
        
        node = new Node(2, new int[] {0, 6, 8});
        graph.addNode(node);
        
        node = new Node(3, new int[] {0, 8, 9});
        graph.addNode(node);
        
        node = new Node(4, new int[] {1, 10, 11});
        graph.addNode(node);
        
        node = new Node(5, new int[] {1, 12});
        graph.addNode(node);
        
        node = new Node(6, new int[] {2});
        graph.addNode(node);
        
        node = new Node(7, new int[] {12, 13, 14});
        graph.addNode(node);
        
        node = new Node(8, new int[] {2,3});
        graph.addNode(node);
        
        node = new Node(9, new int[] {3, 16});
        graph.addNode(node);
        
        node = new Node(10, new int[] {4});
        graph.addNode(node);
        
        node = new Node(11, new int[] {4, 21});
        graph.addNode(node);
        
        node = new Node(12, new int[] {5, 7});
        graph.addNode(node);
        
        node = new Node(13, new int[] {7});
        graph.addNode(node);
        
        node = new Node(14, new int[] {7, 17, 18, 19});
        graph.addNode(node);
        
        node = new Node(15, new int[] {});
        graph.addNode(node);
        
        node = new Node(16, new int[] {9, 20});
        graph.addNode(node);
        
        node = new Node(17, new int[] {14});
        graph.addNode(node);
        
        node = new Node(18, new int[] {14, 21});
        graph.addNode(node);
        
        node = new Node(19, new int[] {14});
        graph.addNode(node);
        
        node = new Node(20, new int[] {16});
        graph.addNode(node);
        
        node = new Node(21, new int[] {11, 18});
        graph.addNode(node);
        
        graph.BFS(4,15);
	}
}