public class Graph {

	private Node nodeList[]; // Adjacency Lists

	// Constructor
	Graph(int n) {
		nodeList = new Node[n];
	}

	// Function to add node to the graph
	public void addNode(Node node) {
		nodeList[node.getKey()] = node;
	}

	
	boolean dfs(int s, int des){
		nodeList[s].setVisited(true);
		if(nodeList[s].getKey() == des)
			return true;
		for(int x : nodeList[s].getAdjacencnyList()){
			if (!nodeList[x].isVisited()) {
				System.out.print(x + " ");
				if(dfs(x, des))
					return true;
			}
		}
		return false;
	}
}