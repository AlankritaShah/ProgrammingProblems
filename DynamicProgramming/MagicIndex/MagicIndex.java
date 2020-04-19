package DynamicProgramming.MagicIndex;

public class MagicIndex {
	private static int findMagicIndex(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == i)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] input = new int[]{-40, -20, -1, 1, 2, 3, 5, 7, 9, 12, 13};
		int[] follow_up_input = new int[] {-10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13};
		System.out.println(findMagicIndex(input));
		System.out.println(findMagicIndex(follow_up_input));
	}
}
