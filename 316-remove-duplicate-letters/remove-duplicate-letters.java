class Solution {
    public String removeDuplicateLetters(String s) {
        char[] a= new char[26];
        for(char i:s.toCharArray()){
            a[i-'a']++;
        }
        StringBuilder b= new StringBuilder();
        Stack<Character> st= new Stack<>();

        for(char c:s.toCharArray()){
            a[c-'a']--;
            if(st.contains(c)){
                continue;
            }
            while(!st.isEmpty() && st.peek()>c && a[st.peek() -'a']>0){
                st.pop();
            }
            st.push(c);
        }
         for (char c : st) {
            b.append(c);
        }
        return b.toString();
    }
}