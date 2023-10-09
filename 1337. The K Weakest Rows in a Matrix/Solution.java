import java.util.Arrays;
import java.util.Collections;

public class KWeakestRowsInMatrix {

	public static void main(String[] args) {
		int k = 5;
		int[][] input = 
					{{1,1,0,0,0},
		             {1,1,1,1,0},
		             {1,0,0,0,0},
		             {1,1,0,0,0},
		             {1,1,1,1,1}};
		int[] ans = kWeakestRows(input, k);
		System.out.println("answer:");
		for (int i : ans) {
			System.out.print(i + " ");
		} //for
	} //main
	
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] toReturn = new int[k];
        int[] soldierNum = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            int n = 0;
            for (int j = 0; j < mat[0].length; j++) {
                n += mat[i][j];
            } //for
            soldierNum[i] = n;
        } //for

        for (int i = 0; i < toReturn.length; i++) {
        	int min = findMinIndex(soldierNum);
            toReturn[i] = min;
            soldierNum[min] = 9999;
        } //for

        return toReturn;
    } //kWeakestRows
    
    private static int findMinIndex(int[] nums) {
    	int min = nums[0];
    	int index = 0;
    	for (int i = 1; i < nums.length; i++) {
    		if (nums[i] < min) {
    			min = nums[i];
    			index = i;
    		} //if
    	} //for
    	return index;
    } //findMinIndex
    
}
