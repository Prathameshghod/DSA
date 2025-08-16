class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a= new ArrayList<>();
        if (numRows==1){
            a.add(Arrays.asList(1));
        }
        else if(numRows==2){
            a.add(Arrays.asList(1));
            a.add(Arrays.asList(1,1));
        }
        else if(numRows>2){

            a.add(Arrays.asList(1));
            a.add(Arrays.asList(1,1));

            for (int i=3;i<=numRows;i++){
                List<Integer> b= new ArrayList<>();
                int c= a.get(i-2).size();
                b.add(1);
                for (int j=1;j<c;j++){
                    b.add(a.get(i-2).get(j)+a.get(i-2).get(j-1));
                }
                b.add(1);
                a.add(b);
            }
        }
        return a;
    }
}



class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a= new ArrayList<>();
        for (int i=0;i<numRows;i++){
            List<Integer> b= new ArrayList<>();

            for(int j=0;j<=i;j++){
                b.add(1);
            }

            for (int j=1;j<i;j++){
                int c=a.get(i-1).get(j-1)+a.get(i-1).get(j);
                b.set(j,c);
            }
            a.add(b);
        }
        return a;
    }
}