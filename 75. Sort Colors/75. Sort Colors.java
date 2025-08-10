Using Counting Sort
Time Complexity: O(n)
Space Complexity: O(n)

Code 

```java
class Solution {
    public int[] cs(int[] a){
        int n=a.length;
        int c=0;
        for (int i=0;i<n;i++){
            c=Math.max(c,a[i]);
        }
        int[] b= new int[c+1];
        for(int i=0;i<n;i++){
            b[a[i]]++;
        }
        int[] d= new int[n];
        int j=0;
        for (int i=0;i<c+1;i++){
            while(b[i]>0){
                d[j]=i;
                j++;
                b[i]--;
            }
        }
        return d;
    }
    public void sortColors(int[] nums) {
        int[] a=cs(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=a[i];
        }
       
    }
}
```java

Optimal Approach:

Dutch National Flag Algorithm
Time Complexity: O(n)
Space Complexity: O(1)

```java
class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int l=0,m=0,h=n-1;
        while(m<=h){
            if(nums[m]==0){
                int temp=nums[m];
                nums[m]=nums[l];
                nums[l]=temp;
                m++;
                l++;
            }
            else if(nums[m]==1){
                m++;
            }
            else if (nums[m]==2){
                int temp=nums[m];
                nums[m]=nums[h];
                nums[h]=temp;
                h--;
            }
            
        }
    }
}
```java


