
public class Node {
 //boolean to check if node is a wall or not
 public boolean isWall;
 //indicator such as 'O' for Oliver , 'X' for wall , ' ' black space for possible path
 public char boxValue;
 //boolean to check if node is currently holding Oliver
 public boolean isOliver;
 //boolean to place cheese variable
 public boolean isCheese;
 //integer for X coordinate of maze
 public int X;
 // integer for Y coordinate of maze
 public int Y;
 //boolean to check if node was visited
 public boolean wasVisited = false;
 //default Constructor
 public Node()
 {
	 isWall = false;
	 boxValue = ' ';
	 isOliver = false;
 }
 public Node(int x , int y , char c)
 {
	 boxValue = c;
	 if(boxValue == 'O')
	 {
		 isOliver = true;
	 }
	 if(boxValue =='X')
	 {
		 isWall = true;
	 }
	 X = x;
	 Y = y;
	 
 }
 
 
 
}
