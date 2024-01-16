class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> losses = new HashMap<>();
        for (int i = 0; i < matches.length; i++) {
            if (!losses.containsKey(matches[i][0])) losses.put(matches[i][0], 0);
            if (!losses.containsKey(matches[i][1])) losses.put(matches[i][1], 0);
        } //for
        for (int i = 0; i < matches.length; i++) {
            int item = matches[i][1];
            losses.put(item, losses.get(item) + 1);            
        } //for
        List<List<Integer>> toReturn = new ArrayList<>();
        toReturn.add(new ArrayList());
        toReturn.add(new ArrayList());
        for (Map.Entry<Integer, Integer> item : losses.entrySet()) {
            int loss = item.getValue();
            if (loss == 0) toReturn.get(0).add(item.getKey());
            else if (loss == 1) toReturn.get(1).add(item.getKey());
        } //for
        Collections.sort(toReturn.get(0));
        Collections.sort(toReturn.get(1));
        return toReturn;
    } //findWinners
} //Solution