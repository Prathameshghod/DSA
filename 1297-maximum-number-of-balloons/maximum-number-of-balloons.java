class Solution {
    public int maxNumberOfBalloons(String text) {
        int n=text.length();
        if(n<7){
            return 0;
        }
        Map<Character,Integer> a=new HashMap<>();
        for(char i:text.toCharArray()){
            if(i=='b' || i=='a' || i=='l' ||i=='o' ||i=='n'){
                a.put(i,a.getOrDefault(i,0)+1);
            }
        }
        return Math.min(
                Math.min(a.getOrDefault('b', 0), a.getOrDefault('a', 0)),
                Math.min(
                        a.getOrDefault('l', 0) / 2,
                        Math.min(a.getOrDefault('o', 0) / 2,
                                 a.getOrDefault('n', 0))
                )
        );
    }
}