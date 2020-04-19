package DynamicProgramming;
import java.util.HashMap;

/**
 * 
 * @author alankrita
 * Triple Step: A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time. Implement a method to count how many possible ways the child can run up the stairs.
 *
 */

public class TripleStep {
	HashMap<Integer, Integer> map = new HashMap<>();
	private int getCountWays(int n) {
		if(n<0)
			return 0;
		else if(n==0)
			return 1;
		else if(map.containsKey(n))
			return map.get(n);
		else {
			map.put(n, getCountWays(n-1) + getCountWays(n-2) + getCountWays(n-3));
			return map.get(n);
		}
	}
	
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		System.out.println(new TripleStep().getCountWays(2000));
		long endTime = System.currentTimeMillis();
		System.out.println("Took "+(endTime - startTime) + " ms"); 	
	}
}
