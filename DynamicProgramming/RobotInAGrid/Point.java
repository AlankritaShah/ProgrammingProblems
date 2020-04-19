package DynamicProgramming.RobotInAGrid;

public class Point {
	
	private int row, col;
	
	public Point(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	@Override
	public String toString() {
		return "(" + row + ", " + col + ")";
	}
}
