class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a= new ArrayList<>();
        a.add(new ArrayList<>(Arrays.asList(1)));
        if(numRows==1){
            return a;
        }
        a.add(new ArrayList<>(Arrays.asList(1,1)));
        if(numRows==2){
            return a;
        }
        for(int i=2;i<numRows;i++){
            ArrayList<Integer> b= new ArrayList<>();
            b.add(1);
            List<Integer> c= a.get(a.size()-1);
            for(int j=1;j<c.size();j++){
                b.add(c.get(j)+c.get(j-1));
            }
            b.add(1);
            a.add(b);
        }
        return a;
    }
}