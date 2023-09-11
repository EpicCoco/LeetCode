import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class GroupPeopleGivenGroupSize {

	public static void main(String[] args) {
		int[] group = {3,3,3,3,3,1,3};
		List<List<Integer>> print = groupThePeople(group);
		System.out.println("Print:");
		for (List<Integer> p : print) {
			System.out.println(p);
		} //for
	} //main
	
	public static List<List<Integer>> groupThePeople(int[] groupSizes) {
		List<List<Integer>> toReturn = new ArrayList<List<Integer>>();
		HashMap<Integer, List<Integer>> hm = new HashMap<Integer, List<Integer>>();

		for (int i = 0; i < groupSizes.length; i++) {
			if (!hm.containsKey(groupSizes[i])) {
				hm.put(groupSizes[i], new ArrayList<Integer>());
			} //if
			hm.get(groupSizes[i]).add(i);
		} //for 

		for (int i : hm.keySet()) {
			List<Integer> nums = hm.get(i);
			List<Integer> toAdd = new ArrayList<Integer>();
			for (int j = 0; j < nums.size(); j++) {
				if (toAdd.size() >= i) {
					toReturn.add(toAdd);
					toAdd = new ArrayList<Integer>();
				} //if
				toAdd.add(nums.get(j));
			} //for
			toReturn.add(toAdd);
		} //for
		return toReturn;
    } //groupThePeople
} //main
