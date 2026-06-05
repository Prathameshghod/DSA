class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder s= new StringBuilder();
        int c=0;
        while(s.length()<b.length()){
            s.append(a);
            c++;
        }
        if(s.indexOf(b)!=-1){
            return c;
        }
        s.append(a);
        c++;
         if(s.indexOf(b)!=-1){
            return c;
        }
        return -1;
    }
}