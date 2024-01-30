class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String s : tokens) {
            if (Character.isDigit(s.charAt(0)) || 
            (s.length() > 1 && Character.isDigit(s.charAt(1)))) {
                st.push(Integer.valueOf(s));
            } else {
                int a = st.pop();
                int b = st.pop();
                switch (s) {
                    case "+":
                        st.push(a + b);
                        break;
                    case "-":
                        st.push(b - a);
                        break;
                    case "*":
                        st.push(a * b);
                        break;
                    default:
                        st.push(b / a);
                        break;
                } //switch
            } //if
        } //for
        return st.pop();
    } //evalRPN
} //Solution