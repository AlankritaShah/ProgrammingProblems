package DynamicProgramming;

/**
 * 
 * @author alankrita
 * Triple Step: A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time. Implement a method to count how many possible ways the child can run up the stairs.
 *
 */

public class TripleStep {
	private int getCountWays(int n) {
		if(n<0)
			return 0;
		else if(n==0)
			return 1;
		else
			return getCountWays(n-1) + getCountWays(n-2) + getCountWays(n-3);
	}
	
	public static void main(String[] args)
	{
		System.out.println(new TripleStep().getCountWays(3));
	}
}
