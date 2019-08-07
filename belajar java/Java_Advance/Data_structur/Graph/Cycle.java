package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Cycle
{
	private int nodes, edges;
	private int[][] adjacency_Matrix;
	private boolean[] visited;
	ArrayList<ArrayList<Integer>> cycles = new ArrayList<ArrayList<Integer>>();
	private boolean[] final_Cycles;
	
	public Cycle()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no. of nodes: ");
		nodes = in.nextInt();
		System.out.println("Enter the no. of Edges: ");
		edges = in.nextInt();
		
		adjacency_Matrix = new int[nodes][nodes];
		visited = new boolean[nodes];
		
		for(int i = 0; i < nodes; i++)
		{
			visited[i] = false;
		}
		System.out.println("Enter the details of each edges <Start Node> <End Node>");
		
		for(int i = 0; i < edges; i ++)
		{
			int start, end;
			start = in.nextInt();
			end = in.nextInt();
			adjacency_Matrix[start][end] = 1;
		}
	}
	
	public void start()
	{
		for(int i = 0; i < nodes; i++)
		{
			ArrayList<Integer> temp = new ArrayList<>();
			dfs(i, i, temp);
			for(int j = 0; j < nodes; j++)
			{
				adjacency_Matrix[i][j] = 0;
				adjacency_Matrix[j][i] = 0;
			}
		}
	}
	
	private void dfs(Integer start, Integer cuur, ArrayList<Integer> temp)
	{
		temp.add(cuur);
		visited[cuur] = true;
		for(int i = 0; i < nodes; i++)
		{
			if(adjacency_Matrix[cuur][i] == 1)
			{
				if(i == start)
				{
					cycles.add(new ArrayList<Integer>(temp));
				}
				else
				{
					if(!visited[i])
					{
						dfs(start, i, temp);
					}
				}
			}
		}
		
		if(temp.size() > 0)
		{
			temp.remove(temp.size() - 1);
		}
		visited[cuur] = false;
	}
	
	public void printAll()
	{
		for (int i = 0; i < cycles.size(); i++)
		{
			for(int j = 0; j < cycles.get(i).size();j++)
			{
				System.out.println(cycles.get(i).get(j) + " -> ");
			}
			System.out.println(cycles.get(i).get(0));
			System.out.println();
		}
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Cycle c = new Cycle();
		c.start();
		c.printAll();
	}

}
