class Solution {

    class Node {
        public Node[] children;
        public char val;
        public boolean endOfWord;
        public Node(char val) {
            children = new Node[26];
            this.val = val;
            endOfWord = false;
        } //Node
    } //Node

    class Trie {
        public Node root = new Node('-');

        public void addWord(String toAdd) {
            Node temp = root;
            for (char c : toAdd.toCharArray()) {
                if (temp.children[c-'a'] == null) {
                    temp.children[c-'a'] = new Node(c);
                }
                temp = temp.children[c-'a'];
            } //for
            temp.endOfWord = true;
        } //addWord

        public String findWord(String word) {
            Node temp = root; 
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (temp.endOfWord) return word.substring(0, i);
                if (temp.children[c-'a'] == null) return "";
                temp = temp.children[c-'a'];
            } //for
            return "";
        } //findWord
    } //Trie

    public String replaceWords(List<String> dictionary, String sentence) {
        Trie trie = new Trie();
        for (String word : dictionary) trie.addWord(word);
        
        String[] splitSentence = sentence.split(" ");
        for (int i = 0; i < splitSentence.length; i++) {
            String searchRes = trie.findWord(splitSentence[i]);
            if (!searchRes.equals("")) splitSentence[i] = searchRes;
        } //for

        StringBuilder res = new StringBuilder();
        for (String str : splitSentence) {
            res.append(str);
            res.append(" ");
        } //for
        return res.toString().trim();
    } //replaceWords
} //Solution