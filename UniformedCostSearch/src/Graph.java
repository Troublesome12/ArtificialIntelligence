import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;


public class Graph {
	
    private Node nodeList[]; 		//Adjacency Lists
 
    // Constructor
    Graph(int n){
    	nodeList = new Node[n];
    }
    
    //Function to add node to the graph
    public void addNode(Node node){
    	nodeList[node.getKey()]=node;
    }
 
    // prints BFS traversal from a given source s
    void BFS(int s, int des){
        // Create a queue for BFS
        Queue<Node> queue = new ArrayDeque<Node>();
 
        // Mark the current node as visited and enqueue it
        nodeList[s].setVisited(true);
        queue.add(nodeList[s]);
 
        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            Node node = queue.poll();
//            System.out.print(node.getKey()+" ");
            
            if(node.getKey()==des){
            	getShortestPath(node, s);
            	break;	
            }
 
            /* 	Get all adjacent vertices of the dequeued vertex s
             	If a adjacent has not been visited, then mark it
            	visited and enqueue it 
            */
            
            for(int x: node.getAdjacencnyList()){
            	if(!nodeList[x].isVisited()){
            		nodeList[x].setVisited(true);
            		nodeList[x].setParent(node);
            		queue.add(nodeList[x]);
            	}
            }
        }
    }
    
    public void getShortestPath(Node node, int s){
    	System.out.print("Shortest path: ");
    	System.out.print(nodeList[s].getKey()+" ");
    	int length = 0;
    	Stack<Node> stack = new Stack<Node>();
    	while(node.getParent()!=null){
    		stack.add(node);
    		node=node.getParent();
    	}
    	
    	while(!stack.isEmpty()){
    		node = stack.pop();
    		length++;
    		System.out.print(node.getKey()+" ");
    	}
    	
    	System.out.println("\nLength="+length);
    }
}