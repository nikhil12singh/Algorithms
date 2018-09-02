import java.util.Iterator;

public class Graph {
	
	private int numVertices;
	LinkedList vertices[];
	
	Graph(int numVertices)
	{
	numVertices = this.numVertices;
	vertices = new LinkedList[numVertices];
	
	for(int i=0;i<numVertices;i++)
	{
		vertices[i] = new LinkedList();
	}
	
	}
	
	public void add(int vertex, int newVertex)
	{
		vertices[vertex].push(newVertex);
	}
	
	public void traverse(int vertex)
	{
		boolean flag[] = new boolean[numVertices];
		traverseUtil(flag, vertex);
	}
	
	public static void traverseUtil(boolean flag[], int vertex)
	{
		flag[vertex] = true;
		Iterator<Integer> itr = vertices[vertex].iterator();
		
		while(vertices[vertex].hasNext())
		{
			int vertex = vertices[vertex].next();
			if(!flag[vertex])
				traverse(vertex);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}


