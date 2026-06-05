class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder s= new StringBuilder();
 
        int an=a.length();
        int bn=b.length();
        int d=bn/an;
        if(bn%an!=0){
            d++;
        }

        for(int i=0;i<d;i++){
            s.append(a);
        }

        if(s.indexOf(b)!=-1){
            return d;
        }
        s.append(a);
        d++;
        if(s.indexOf(b)!=-1){
            return d;
        }
        return -1;
    }
}