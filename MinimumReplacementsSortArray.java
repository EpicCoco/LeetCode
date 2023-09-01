import java.util.ArrayList;

public class MinimumReplacementsSortArray {

	
	public static void main(String[] args) {
		int[] nums = {2,10,20,19,1};
		int[] nums2 = {12,9,7,6,17,19,21};
		int[] nums3 = {368,112,2,282,349,127,36,98,371,79,309,221,175,262,224,215,230,250,84,269,384,328,118,97,17,105,342,344,242,160,394,17,120,335,76,101,260,244,378,375,164,190,320,376,197,398,353,138,362,38,54,172,3,300,264,165,251,24,312,355,237,314,397,101,117,268,36,165,373,269,351,67,263,332,296,13,118,294,159,137,82,288,250,131,354,261,192,111,16,139,261,295,112,121,234,335,256,303,328,242,260,346,22,277,179,223};
		System.out.println(minimumReplacement(nums3));
		
	} //main

	public static long minimumReplacement(int[] nums) {
		long count = 0;
		int max = nums[nums.length - 1];
		for (int i = nums.length - 2; i >= 0; i--) {
			int num = nums[i];
			if (num > max) {
				int n = num / max;
				count += n;
				if (n * max != num) {
					n++;
					max = num / n;
				} else {
					count--;
				} //if
			} else {
				max = num;
			} //if
		} //for
		return count;
	} //minimumReplacement
	
	
	/*
	public static long minimumReplacement(int[] nums) {
		int count = 0;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			numbers.add(nums[i]);
		} //for
		for (int i = numbers.size() - 2; i >= 0; i--) {
			System.out.println(numbers);
			count += splitNum(numbers, i, numbers.get(i + 1));
			
		} //for
		return count;
	} //minimumReplacement
	
	
	public static int splitNum(ArrayList<Integer> nums, int index, int maxValue) {
		int moves = 0;
		int num = nums.get(index);
		while (num > maxValue * 2) {
			nums.add(index + 1, maxValue);
			num -= maxValue;
			moves++;
		} //while
		int greater = num % 2 == 0 ? num / 2 : (num / 2) + 1;
		int lesser = num / 2;
		nums.add(index + 1, greater);
		nums.set(index, lesser);
		return moves + 1;
	} //splitNum
	*/
	/*
	public static long minimumReplacement(int[] nums) {
		int moves = 0;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			numbers.add(nums[i]);
		} //for
		int globalMinIndex = minimumIndex(numbers);
		
		System.out.println(globalMinIndex);
		System.out.println(numbers);
		for (int i = globalMinIndex - 1; i >= 0; i--) {
			int num = numbers.get(i);
			int greater = num % 2 == 0 ? num / 2 : (num / 2) + 1;
			int lesser = num / 2;
			numbers.add(i + 1, greater);
			numbers.set(i, lesser);
			moves++;
			System.out.println(numbers);
		} //for
		return moves;		
	} //minimumReplacement
	
	public static int minimumIndex(ArrayList<Integer> numbers) {
		int min = numbers.get(0);
		int minIndex = 0;
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) < min) {
				minIndex = i;
				min = numbers.get(i);
			} //if
		} //for
		return minIndex;
	} //minimumIndex
	
	public static boolean check(ArrayList<Integer> nums) {
		for (int i = 0; i < nums.size() - 1; i++) {
			if (nums.get(i) > nums.get(i + 1)) {
				return true;
			} //if
		} //for
		return false;
	} //check
	*/
	
	/*
	 public static void main(String[] args) {
		int[] nums = {2,10,20,19,1};
		System.out.println(minimumReplacement(nums));
	}
	
	public static long minimumReplacement(int[] nums) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			numbers.add(nums[i]);
		} //for
		return minimumReplacementRecurse(numbers);
	} //minumumReplacement

	public static long minimumReplacementRecurse(ArrayList<Integer> numbers) {
        int moves = 0;
        
		for (int i = 0; i < numbers.size() - 1; i++) {
			int currentNum = numbers.get(i);
			int nextNum = numbers.get(i + 1);
			if (currentNum > nextNum) {
				moves++;
				numbers.add(i + 1, currentNum - nextNum);
				numbers.set(i, nextNum);
			} //if
			System.out.println(numbers);
		} //for
		if (check(numbers)) {
			return moves + minimumReplacementRecurse(numbers);
		} //if
		
		return moves;
    } //minimumReplacement
	
	public static boolean check(ArrayList<Integer> nums) {
		for (int i = 0; i < nums.size() - 1; i++) {
			if (nums.get(i) > nums.get(i + 1)) {
				return true;
			} //if
		} //for
		return false;
	} //check
	 */
} //MinimumReplacement
