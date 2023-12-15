class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> hm = new HashSet<>();
        for (List<String> list : paths) hm.add(list.get(0));
        for (List<String> list : paths) {
            if (!hm.remove(list.get(1))) return list.get(1);
        } //for
        return ""; //unreachable
    } //destCity
} //Solution