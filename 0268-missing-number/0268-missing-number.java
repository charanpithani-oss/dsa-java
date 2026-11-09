import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(int j=0;j<=nums.length;j++){
            if(!s.contains(j)){
                return j;
            }
        }
        return -1;
    }
}