/*to do: find largest positive number in array whose negative number is also present in th same array

Think this way:: 

if we only had to find largest:

class Solution {
    public int findMaxK(int[] nums) {
        
        int max = 0;
        
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }else{
                continue;
            }
        }
        
        return max;
    }
}
This returns maximum value 

Now we need maximum value which also has negative value in array so we will use hashset or hashmap but I will use hashset since hashset doesnt have repeatative element with similar approach



*/


class Solution {
    public int findMaxK(int[] nums) {
        //make a set
        HashSet<Integer> mySet = new HashSet<>();
        
        //initialize by -1 as we will return this if we wont find anything
        int max = -1;
        
        //looping through all array 
        for(int element: nums){
            
            //if absoulte value (modulus) of cuurent element greater than max AND if your set has negative of the current absolute value then replace max by current element else add it in set
           if(Math.abs(element)>max && mySet.contains(-element)){
             
                   max = Math.abs(element);
               }else{
                   mySet.add(element);
               }
           } 
        
        
        //keep iterating loop until final max value found then return the final value
        return max;

    }
}