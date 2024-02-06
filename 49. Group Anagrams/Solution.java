class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for (String str : strs) {
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);
            if (!hm.containsKey(key)) hm.put(key, new ArrayList<>());
            List<String> list = hm.get(key);
            list.add(str);
        } //for
        List<List<String>> toReturn = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : hm.entrySet()) {
            toReturn.add(entry.getValue());
        } //for
        return toReturn;
    } //groupAnagrams
} //Solution