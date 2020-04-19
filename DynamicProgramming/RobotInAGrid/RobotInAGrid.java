package DynamicProgramming.RobotInAGrid;
import java.util.ArrayList;
import java.util.HashMap;

public class RobotInAGrid {
	private ArrayList<Point> getPath(boolean[][] grid)
	{
		ArrayList<Point> path = new ArrayList<>();
		HashMap<Point, Boolean> failedPath = new HashMap<>();
		if(getPath(grid, grid.length-1, grid[0].length-1, path, failedPath))
			return path;	
		return null;
	}
	
	private boolean getPath(boolean[][] grid, int r, int c, ArrayList<Point> path, HashMap<Point, Boolean> failedPath) {
		if(r < 0 || c < 0 || !grid[r][c])
			return false;
		
		boolean isOrigin = r==0 && c==0;
		Point point = new Point(r, c);
		if(failedPath.containsKey(point))
			return false;
		
		if(isOrigin || getPath(grid, r-1, c, path, failedPath) || getPath(grid, r, c-1, path, failedPath)) {
			path.add(point);
			return true;
		}
		failedPath.put(point, false);
		return false;
	}
	
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		
		boolean[][] grid = new boolean[10][10];
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				grid[i][j] = true;
			}
		}
		
		ArrayList<Point> path = new RobotInAGrid().getPath(grid);
		if(path!=null)
			System.out.println(path.toString());
		else
			System.out.println("No such path");
		
		long endTime = System.currentTimeMillis();
		System.out.println("Took "+(endTime - startTime) + " ms"); 	
	}
}
