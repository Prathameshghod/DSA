class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int n=players.length;
        int m=trainers.length;
        int i=n-1;
        int j=m-1;
        int c=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        while(i>=0 && j>=0){
            if(trainers[j]>=players[i]){
                c++;
                j--;
            }
            i--;
        }
        return c;
    }
}