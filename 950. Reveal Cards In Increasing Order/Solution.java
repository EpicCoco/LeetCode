class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[] toReturn = new int[deck.length];
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < deck.length; i++) ll.add(i);
        for (int num : deck) {
            toReturn[ll.poll()] = num;
            if (!ll.isEmpty()) ll.offerLast(ll.poll());
        } //for
        return toReturn;
    } //deckRevealedIncreasing
} //Solution