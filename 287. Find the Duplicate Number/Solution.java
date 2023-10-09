import java.util.HashSet;

public class FindDuplicateNumber {

	public static int findDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i : nums) {
        	if (!hs.add(i)) {
        		return i;
        	} //if
        } //for
        return 0;
    } //findDuplicate
	
} //FindDuplicateNumber
