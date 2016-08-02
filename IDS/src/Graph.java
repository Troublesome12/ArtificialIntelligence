public class Graph {

	private Node nodeList[]; // Adjacency Lists
	int depthLimit = 2;
	// Constructor
	Graph(int n) {
		nodeList = new Node[n];
	}

	// Function to add node to the graph
	public void addNode(Node node) {
		nodeList[node.getKey()] = node;
	}
	
	public void unVisitALLNodes(){
		for(Node x: nodeList)
			x.setVisited(false);
	}
	
	boolean ids(int s, int des, int depth){
		if(--depth<=0)
			return false;
		nodeList[s].setVisited(true);
		if(nodeList[s].getKey() == des)
			return true;
		for(int x : nodeList[s].getAdjacencnyList()){
			if (!nodeList[x].isVisited()) {
				System.out.print(x + " ");
				if(ids(x, des, depth))
					return true;
			}
		}
		return false;
	}
}