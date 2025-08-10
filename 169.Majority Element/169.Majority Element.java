Using HashMap:
Time Complexity: O(n)
Space Complexity: O(n)

````java

class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int a=(int) Math.floor(n/2);
        int c=0;
        int d=0;
        Map<Integer,Integer> b= new HashMap<>();
        for (int i=0;i<n;i++){
            b.put(nums[i],b.getOrDefault(nums[i],0)+1   );
            if(b.get(nums[i])>c){
                d=nums[i];
                c=b.get(nums[i]);
            }
        }
        return d;

    }
}

````java
    

Boyer–Moore Voting Algorithm

Time Complexity: O(n)
Space Complexity: O(1)

```java
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int a=0,b=0;
        for(int i:nums){
            if(b==0){
                a=i;
            }
            b+= i==a ?1:-1;
        }
        return a;
    }
}
```java 