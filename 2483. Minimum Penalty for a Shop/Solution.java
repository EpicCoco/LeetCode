class MinimumPenaltyShop{
	
	public static void main(String[] args) {
		String customers = "NNNN";
		System.out.println(bestClosingTime(customers));
	}
    public static int bestClosingTime(String customers) {
    	int bestScore = 0;
    	int score = 0;
    	int bestI = 0;
    	for (int i = 0; i < customers.length(); i++) {
    		score += customers.charAt(i) == 'Y' ? -1 : 1;
    		System.out.println("score at " + i + ":" + score);
    		if (score < bestScore) {
    			bestScore = score;
    			bestI = i + 1;
    		} //if
    	} //for
    	return bestI;
    }

/*
 *  public static int bestClosingTime(String customers) {
        String strToInt = "";
        for (int i = 0; i < customers.length(); i++) {
            strToInt += (customers.charAt(i) == 'Y' ? "1" : "0");
        } //for
        int cust = Integer.valueOf(strToInt);
        return cust;

    } //bestClosingTime
 */
} //Solution
