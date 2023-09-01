
public class CountingBits {
	
	public static void main(String[] args) {
		int[] bits = countBitsWorking(256);
		for (int i = 0; i < bits.length; i++) {
			if (bits[i] == 1) System.out.println();
			System.out.print(bits[i] + " ");
			
		} //for
		System.out.println("break");
		int[] realBits = countBits(64);
		for (int i = 0; i < realBits.length; i++) {
			if (realBits[i] == 1) System.out.println();
			System.out.print(realBits[i] + " ");
			
		} //for
	} //main
	
	public static int[] countBits(int n) {
		int[] toReturn = new int[n + 1];
		toReturn[0] = 0;
		int[] pattern = {0, 1, 1 , 2};
		int binTracker = 1;
		for (int i = 1; i < toReturn.length; i++) {
			int bit, tempI;		
			tempI = i - binTracker;
			if (tempI < 4) {
				bit = pattern[tempI % 4] + 1;
			} else {
				bit = 1;
				bit *= toReturn[(tempI / 4) + binTracker];
				bit += pattern[tempI % 4];
			} //if
			toReturn[i] = bit;
			if (tempI + 1 == binTracker) {
				binTracker *= 2;
			} //if
		} //for
		return toReturn;
	} //countBits
	
	
	
    public static int[] countBitsWorking(int n) {
        int[] toReturn = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            String bin = Integer.toBinaryString(i);
            int oneCount = 0;
            for (int j = 0; j < bin.length(); j++) {
                if (bin.charAt(j) == '1') {
                    oneCount++;
                } //if
            } //for
            toReturn[i] = oneCount;
        } //for
        return toReturn;
    } //countBits
} //CountingBits
