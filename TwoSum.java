class Solution {
    public int[] twoSum(int[] nums, int target){
        for(int i = 0; i< nums.length -1; i++){
          for (int k = i+1; k < nums.length;k++){
             if((nums[i]+nums[k]) == target){
                 int [] array = {i,k};
                 return array;
             }
          }
        }
        return null;
    }
