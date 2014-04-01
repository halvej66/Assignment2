
public class Node {
 //boolean to check if node is a wall or not
 public boolean isWall;
 //indicator such as 'O' for Oliver , 'X' for wall , ' ' black space for possible path
 public char boxValue;
 //boolean to check if node is currently holding Oliver
 public boolean isOliver;
 //integer for X cordinate of maze
 public int X;
 // integer for Y cordinate of maze
 public int Y;
 //default Constructor
 public Node()
 {
	 isWall = false;
	 boxValue = '/';
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
