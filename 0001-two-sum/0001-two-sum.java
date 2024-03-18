/* given input as parameter : array nums , target
   return type : array 

  2 pointer appraoch: Time complexity: loop inside loop : O(n^2)
  class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
               if(nums[i]+nums[j]==target){
                   return new int[]{i,j};
               }
            }
}
        return nums;
    }
}


This can give repeating elements of array so ake sure indexes are different
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
               if(i!=j && nums[i]+nums[j]==target){
                   return new int[]{i,j};
               }
            }
}
        return nums;
    }
}

*/




class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
               if(i!=j && nums[i]+nums[j]==target){
                   return new int[]{i,j};
               }
            }
}
        return nums;
    }
}