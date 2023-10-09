import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		List<List<Integer>> pascal = generate(5);
		System.out.println(pascal.toString());
	} //main
	
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> toReturn = new ArrayList<List<Integer>>();
        if (numRows == 0) return toReturn;
        List<Integer> one = new ArrayList<Integer>();
        one.add(1);
        toReturn.add(one);
        for (int i = 1; i < numRows; i++) {
        	List<Integer> list = new ArrayList<Integer>();
        	while(list.size() <= i) list.add(1);
        	for (int j = 1; j < i; j++) {
        		list.set(j, toReturn.get(i - 1).get(j - 1) + toReturn.get(i - 1).get(j));
        	} //for
        	toReturn.add(list);
        } //for
        return toReturn;
    } //generate
	
} //PascalsTriangle
