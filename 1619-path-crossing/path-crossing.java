class Solution {
    public boolean isPathCrossing(String path) {
        int x=0;
        int y=0;
        Set<String> vis=new HashSet<>();
        vis.add(x+","+y);
        for(char i:path.toCharArray()){
            if(i=='N'){
                y++;
            }
            else if(i=='S'){
                y--;
            }
            else if(i=='E'){
                x++;
            }
            else{
                x--;
            }
            if(vis.contains(x+","+y)){
                return true;
            }
            vis.add(x+","+y);
        }
        return false;
    }
}