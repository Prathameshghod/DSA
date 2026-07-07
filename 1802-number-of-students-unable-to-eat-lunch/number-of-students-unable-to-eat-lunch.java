class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n=students.length;
        int o=0;
        int z=0;
        for(int i=0;i<n;i++){
            if(students[i]==1){
                o++;
            }
            else{
                z++;
            }
        }
        for(int i=0;i<n;i++){
            if(sandwiches[i]==1){
                if(o>0){
                     o--;
                }
                else{
                    return n-i;
                }
            }
            else{
                if(z>0){
                     z--;
                }
                else{
                    return n-i;
                }
            }
        }
        return 0;
    }
}