class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int n=s.length();
        int max=-1;
        int[] f= new int[26];
        int[] l= new int[26];
        Arrays.fill(f,-1);
        Arrays.fill(l,-1);
        for(int j=0;j<n;j++){
            char i=s.charAt(j);
            if( f[i-'a']>-1){
                l[i-'a']=j;
                continue;
            }
             f[i-'a']=j;
        }
        // for(int j=n-1;j>=0;j--){
        //     char i=s.charAt(j);
        //     if( l[i-'a']>-1){
        //         continue;
        //     }
        //      l[i-'a']=j;
        // }
        for(int i=0;i<26;i++){
            if(f[i]==-1 || l[i]==-1 ){
                continue;
            }
            max=Math.max(l[i]-f[i]-1,max);
        }
        return max;
    }
}