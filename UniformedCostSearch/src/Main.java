import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Graph graph = new Graph(13);		//number of total nodes is sent as argument
		ArrayList<AdjacentNode> adjacencyList = new ArrayList<>();
		
		//adjacentNodes and their costs for Node 0 
		AdjacentNode adjacentNode = new AdjacentNode(1, 75);
		adjacencyList.add(adjacentNode);
		adjacentNode = new AdjacentNode(3, 140);
		adjacencyList.add(adjacentNode);
		adjacentNode = new AdjacentNode(4, 118);
		adjacencyList.add(adjacentNode);
        Node node = new Node(0, adjacencyList);
        graph.addNode(node);
        adjacencyList.clear();
        
        //adjacentNodes and their costs for Node 1 
        adjacentNode = new AdjacentNode(0, 75);
		adjacencyList.add(adjacentNode);
		adjacentNode = new AdjacentNode(2, 71);
		adjacencyList.add(adjacentNode);
        node = new Node(1, adjacencyList);
        graph.addNode(node);
        adjacencyList.clear();
        
        //adjacentNodes and their costs for Node 2 
        adjacentNode = new AdjacentNode(1, 71);
		adjacencyList.add(adjacentNode);
		adjacentNode = new AdjacentNode(3, 151);
		adjacencyList.add(adjacentNode);
        node = new Node(2, adjacencyList);
        graph.addNode(node);
        adjacencyList.clear();
        
        //adjacentNodes and their costs for Node 3 
        adjacentNode = new AdjacentNode(2, 151);
		adjacencyList.add(adjacentNode);
		adjacentNode = new AdjacentNode(0, 140);
		adjacencyList.add(adjacentNode);
		adjacentNode = new AdjacentNode(12, 99);
		adjacencyList.add(adjacentNode);
		adjacentNode = new AdjacentNode(9, 80);
		adjacencyList.add(adjacentNode);
        node = new Node(3, adjacencyList);
        graph.addNode(node);
        adjacencyList.clear();
        
        //adjacentNodes and their costs for Node 4 
        adjacentNode = new AdjacentNode(0, 118);
		adjacencyList.add(adjacentNode);
		adjacentNode = new AdjacentNode(5, 111);
		adjacencyList.add(adjacentNode);
        node = new Node(4, adjacencyList);
        graph.addNode(node);
        adjacencyList.clear();
        
        //adjacentNodes and their costs for Node 5 
        adjacentNode = new AdjacentNode(4, 111);
		adjacencyList.add(adjacentNode);
		adjacentNode = new AdjacentNode(6, 70);
		adjacencyList.add(adjacentNode);
        node = new Node(5, adjacencyList);
        graph.addNode(node);
        adjacencyList.clear();
        
        //adjacentNodes and their costs for Node 6 
        adjacentNode = new AdjacentNode(5, 70);
		adjacencyList.add(adjacentNode);
		adjacentNode = new AdjacentNode(7, 75);
		adjacencyList.add(adjacentNode);
        node = new Node(6, adjacencyList);
        graph.addNode(node);
        adjacencyList.clear();
        
        //adjacentNodes and their costs for Node 7 
        adjacentNode = new AdjacentNode(6, 75);
		adjacencyList.add(adjacentNode);
		adjacentNode = new AdjacentNode(8, 120);
		adjacencyList.add(adjacentNode);
        node = new Node(7, adjacencyList);
        graph.addNode(node);
        adjacencyList.clear();
        
        //adjacentNodes and their costs for Node 8 
        adjacentNode = new AdjacentNode(7, 120);
		adjacencyList.add(adjacentNode);
		adjacentNode = new AdjacentNode(9, 146);
		adjacencyList.add(adjacentNode);
		adjacentNode = new AdjacentNode(10, 138);
		adjacencyList.add(adjacentNode);
        node = new Node(8, adjacencyList);
        graph.addNode(node);
        adjacencyList.clear();
        
        //adjacentNodes and their costs for Node 9 
        adjacentNode = new AdjacentNode(8, 146);
		adjacencyList.add(adjacentNode);
		adjacentNode = new AdjacentNode(3, 80);
		adjacencyList.add(adjacentNode);
		adjacentNode = new AdjacentNode(10, 97);
		adjacencyList.add(adjacentNode);
        node = new Node(9, adjacencyList);
        graph.addNode(node);
        adjacencyList.clear();
        
        //adjacentNodes and their costs for Node 10 
        adjacentNode = new AdjacentNode(9, 97);
		adjacencyList.add(adjacentNode);
		adjacentNode = new AdjacentNode(8, 138);
		adjacencyList.add(adjacentNode);
		adjacentNode = new AdjacentNode(11, 101);
		adjacencyList.add(adjacentNode);
        node = new Node(10, adjacencyList);
        graph.addNode(node);
        adjacencyList.clear();
        
        //adjacentNodes and their costs for Node 11 
        adjacentNode = new AdjacentNode(10, 101);
		adjacencyList.add(adjacentNode);
		adjacentNode = new AdjacentNode(12, 211);
		adjacencyList.add(adjacentNode);
        node = new Node(11, adjacencyList);
        graph.addNode(node);
        adjacencyList.clear();
        
        //adjacentNodes and their costs for Node 12 
        adjacentNode = new AdjacentNode(3, 99);
		adjacencyList.add(adjacentNode);
		adjacentNode = new AdjacentNode(11, 211);
		adjacencyList.add(adjacentNode);
        node = new Node(12, adjacencyList);
        graph.addNode(node);
        adjacencyList.clear();
        
        graph.BFS(4,15);
	}
}