import java.util.ArrayList;
import java.util.List;

public class Node {
	
	private int key;
	private Node parent;
	private boolean visited=false;
	private List<Integer> adjacencyList = new ArrayList<Integer>();
	
	public Node(int key, int[] adjacencyArray){
		this.key=key;
		for(int x : adjacencyArray){
			adjacencyList.add(x);
		}
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
	
	public List<Integer> getAdjacencnyList(){
		return adjacencyList;
	}
	
	public Node getParent(){
		return parent;
	}
	
	public boolean isVisited(){
		return visited;
	}
}