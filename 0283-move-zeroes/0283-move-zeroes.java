import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> temp= new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                temp.add(nums[i]);
            }
        }
        while(temp.size()<n){
            temp.add(0);
        }
        for(int i=0;i<n;i++){
            nums[i]=temp.get(i);
        }
        
    }
}