# academic 

https://leetcode.com/problems/remove-element/post-solution/?submissionId=1130607552

# Intuition
To have two loops, but then we only need the good part of the array so no need to keep the top part with excahnged values

# Approach
Iterate from top (end of array) to bottom

# Complexity
- Time complexity:
One pass so =O(n)?

- Space complexity:
Create one int so its O(0)? Have a look at the code per leetcode it takes less than a millisecond, is very fast and memory used is less than 40% of submissions. I keep track of good values only, the ending part of array has duplicates but since question says we do not need to worry about that and its not counted so I let them be. So we do not need an inner array. That works out very fast

# Code
```
class Solution {
    public int removeElement(int[] nums, int val) {
        int rtn = 0;
        int top = nums.length -1;
        for(int i = nums.length-1; i >=0; i--){
            if(nums[i] == val){
                nums[i] = nums[top];
                top--;
            }else{
                rtn++;
            }
        }
        return rtn;
    }
}
```


Full code with [**test helpers**](https://github.com/tgkprog/academic/blob/master/src/main/java/leet/simple/RemoveValueInPlaceFromArray.java).
