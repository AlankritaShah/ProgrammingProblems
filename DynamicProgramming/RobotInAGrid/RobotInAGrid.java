package DynamicProgramming.RobotInAGrid;
import java.util.ArrayList;

public class RobotInAGrid {
	private ArrayList<Point> getPath(boolean[][] grid)
	{
		ArrayList<Point> path = new ArrayList<>();
		if(getPath(grid, grid.length-1, grid[0].length-1, path))
			return path;	
		return null;
	}
	
	
	private boolean getPath(boolean[][] grid, int r, int c, ArrayList<Point> path) {
		if(r < 0 || c < 0 || !grid[r][c])
			return false;
		
		boolean isOrigin = r==0 && c==0;
		
		if(isOrigin || getPath(grid, r-1, c, path) || getPath(grid, r, c-1, path)) {
			path.add(new Point(r, c));
			return true;
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		
		boolean[][] grid = new boolean[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				grid[i][j] = true;
			}
		}
		
		grid[0][2] = false;
		
		ArrayList<Point> path = new RobotInAGrid().getPath(grid);
		if(path!=null)
			System.out.println(path.toString());
		else
			System.out.println("No such path");
		
		long endTime = System.currentTimeMillis();
		System.out.println("Took "+(endTime - startTime) + " ms"); 	
	}
}
