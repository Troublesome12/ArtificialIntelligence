import java.util.ArrayList;

public class Node {
	
	private int key;
	private Node parent;
	private boolean visited=false;
	private ArrayList<AdjacentNode> adjacencyList = new ArrayList<>();
	
	public Node(int key, ArrayList<AdjacentNode> adjacencyList){
		this.key=key;
		this.adjacencyList = adjacencyList;
	}

	public void setParent(Node parent){
		this.parent=parent;
	}
	
	public void setVisited(boolean visited){
		this.visited=visited;
	}
	
	public int getKey(){
		return key;
	}
	
	public ArrayList<AdjacentNode> getAdjacencnyList(){
		return adjacencyList;
	}
	
	public Node getParent(){
		return parent;
	}
	
	public boolean isVisited(){
		return visited;
	}
}