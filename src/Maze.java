
public class Maze 
{
	//2-D array of nodes to hold node objects
	public Node[][] maze;
	//boolean variable to check if array has already been populated with maze contents
	public boolean isPopulated = false;
	
	//defualt constructor making a Normal 5X5 maze of Nodes
	public Maze()
	{
		maze = new Node[5][5];
	}
	//default constructor accepting an integer N to create a NxN array of the passed value
	public Maze(int inputValue)
	{
		maze = new Node[inputValue][inputValue];
	}
	//populates the maze with outer walls
	public void createMazeWalls()
	{
		/*
		 * Creates maze border
		 * Example for 5X5 maze
		 * XXXXX
		 * X   X
		 * X   X
		 * X   X
		 * XXXXX
		 */
		for(int i=0;i<maze.length;i++)
		{
			for(int j = 0; j < maze.length; j++)
			{
				//fills in whole first Row of Y=0 row in X,Y plot terms
				if( j == 0){
					Node insertNode = new Node(i,j,'X');
					maze[i][j] = insertNode;
				}
				// fills in whole left X=0 column in X,Y plots terms
				else if( j >= 0 && i == 0)
				{
					Node insertNode = new Node(i,j,'X');
					maze[i][j] = insertNode;
				}
				//fills in whole right wall of maze or length - 1 terms.
				else if( j == maze.length-1 && i < maze.length)
				{
					Node insertNode = new Node(i,j,'X');
					maze[i][j] = insertNode;
				}
				//fills in bottom wall of maze
				else  if( j < 10 && i == maze.length - 1)
				{
					Node insertNode = new Node(i,j,'X');
					maze[i][j] = insertNode;
				}
			}
		}
		isPopulated = true;
		
	}
}
