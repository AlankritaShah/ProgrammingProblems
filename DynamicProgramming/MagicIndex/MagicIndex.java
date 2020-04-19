package DynamicProgramming.MagicIndex;

public class MagicIndex {
	private static int findMagicIndex(int[] arr) {
		return magicFast(arr, 0, arr.length);
	}
	
	public static int magicFast(int[] array, int start, int end) {
		if (end < start) {
			return -1;
		}
		int midIndex = (start + end) / 2;
		int midValue = array[midIndex];
		if (midValue == midIndex) {
			return midIndex;
		}
		/* Search left */
		int leftIndex = Math.min(midIndex - 1, midValue);
		int left = magicFast(array, start, leftIndex);
		if (left >= 0) {
			return left;
		}
		
		/* Search right */
		int rightIndex = Math.max(midIndex + 1, midValue);
		int right = magicFast(array, rightIndex, end);
		
		return right;
	}
	
	public static void main(String[] args) {
		int[] input = new int[]{-40, -20, -1, 1, 2, 3, 5, 7, 9, 12, 13};
		int[] follow_up_input = new int[] {-10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13};
		System.out.println(findMagicIndex(input));
		System.out.println(findMagicIndex(follow_up_input));
	}
}
