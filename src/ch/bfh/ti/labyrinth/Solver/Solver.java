package ch.bfh.ti.labyrinth.Solver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import ch.bfh.ti.labyrinth.Creator.Tile;

public class Solver
{
	private Tile[][] maze; // The maze
	private Tile[][] finalMaze;
	private boolean[][] visited;
	private boolean[][] mazepath; // The solution to the maze

	private int rows, cols;
	private int startX, startY; // Starting X and Y values of maze
	private int endX, endY;     // Ending X and Y values of maze
	
	public Solver(int x, int y) throws FileNotFoundException{
		startX = x;
		startY = y;
		solveMaze();
	}
	
	private void solveMaze() throws FileNotFoundException {
	    // Will leave you with a boolean array (correctPath) 
	    // with the path indicated by true values.
	    // If b is false, there is no solution to the maze
		
        // Sets boolean Arrays to default values
		
		maze = loadMaze();
			
		visited = new boolean[rows][cols];
		mazepath = new boolean[rows][cols];
		
		for (int r = 0; r < rows; r++)
	        for (int c = 0; c < cols; c++){
	            visited[r][c] = false;
	            mazepath[r][c] = false;
	        }
	    @SuppressWarnings("unused")
		boolean b = recursiveSolve(startX, startY); //start recursive solving
	    
	    //print out map of path
		for (int i = 0; i < mazepath.length;i++){
			for (int j = 0; j < mazepath[i].length; j++){
				if (mazepath[i][j])
					System.out.print("x");
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}
	
	private Tile[][] loadMaze() throws FileNotFoundException{
		
		//get width and height of maze
        File f = new File("maze.txt");
        @SuppressWarnings("resource")
		Scanner s = new Scanner(f);
        
        while(s.hasNextLine())  {
            rows++;
            String line = s.nextLine();
            cols = line.length();
        }

        System.out.println("loadmaze:");
        System.out.println("cols: " + cols);
        System.out.println("rows: " + rows);
        
        maze = new Tile[rows][cols];
        Scanner m = new Scanner(f);
        
        for (Integer i = 0; i < rows; i++){
        	for (Integer j = 0; j < cols; j++){
        			
        		//get type from character at position in txt
        		for (int x = 0; m.hasNext(); x++) {
                String line = m.nextLine();
                	for (int y = 0; y < line.length(); y++)
                	{
                		String c = "" + line.charAt(y);
                		maze[x][y] = new Tile(i,j,null);
                      	maze[x][y].type = Integer.parseInt(c);
                      	//System.out.print(maze[x][y].type);
                	}
                	//System.out.println();
        		}
        	}
        }
        
        prepareMaze();
        
        return finalMaze;
	}
	
	private boolean recursiveSolve(int x, int y) {
	    if (maze[x][y].type == 4){
	    	mazepath[x][y] = true;
	    	return true; // If you reached the end
	    }
	    if (maze[x][y].type == 0 || visited[x][y]) return false;  
	    // If you are on a wall or already were here
	    visited[x][y] = true;
	    if (x != 0) //not left edge
	        if (recursiveSolve(x-1, y)) { // Recalls method one to the left
	            mazepath[x][y] = true; // Sets that path value to true;
	            return true;
	        }
	    if (x != rows-1) //not right edge
	        if (recursiveSolve(x+1, y)) { // Recalls method one to the right
	            mazepath[x][y] = true;
	            return true;
	        }
	    if (y != 0)  //not top edge
	        if (recursiveSolve(x, y-1)) { // Recalls method one up
	            mazepath[x][y] = true;
	            return true;
	        }
	    if (y != cols-1) //not bottom edge
	        if (recursiveSolve(x, y+1)) { // Recalls method one down
	            mazepath[x][y] = true;
	            return true;
	        }
	    return false;
	}
	
	private void prepareMaze(){
		
		//initialize final array
		finalMaze = new Tile[(rows+2)][(cols+2)];
		for (Integer i = 0; i < (rows+2); i++){
			for (Integer j = 0; j < (cols+2); j++){
				finalMaze[i][j] = new Tile(i,j,null);
				finalMaze[i][j].type = 0;
			}
		}
		
		//shift array one row down and a column to the right
		for (Integer i = (rows); i > 0 ; i--){
			for (Integer j = (cols); j > 0; j--){
				finalMaze[i][j] = maze[i-1][j-1];
			}
		}
		
		for (Integer i = 0; i < (cols+2); i++){
			if (finalMaze[1][i].type == 1){
				finalMaze[0][i].type = 4;
				break;
			}
		}
		
		//print final maze to console
		for (Integer i = 0; i < (rows+2); i++){
			for (Integer j = 0; j < (cols+2); j++){
				System.out.print(finalMaze[i][j].type);
			}
			System.out.println();
		}
	
		cols = cols + 2;
		rows = rows + 2;
		
	}

	public Tile[][] getMaze() {
		return maze;
	}

	public boolean[][] getMazepath() {
		return mazepath;
	}
}
