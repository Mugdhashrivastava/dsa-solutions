/*
First If division was allowed :
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int product = 1;
        
        for(int i=0; i<nums.length;i++){
            
            product = product*nums[i];
        }
        
        
        int answer[] = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            answer[i] = product/nums[i];
        }
        
        return answer;
    }
    
    
    But still it would cause trouble if the current element itself is 0 so we will go with another approach
    
    
    
    
    
    class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        
    > Declare 2 arrays to store product of all prefix and suffix of current value
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        
        
    > Creation of prefix array  
    >Initialize it with 1 for first element, never initialize with 0 since we need product and 0xanything = 0
        prefix[0] = 1;
    >loop to parse all array except nums[0] , we can take break points from 0 to nums.length-2 too but this is giving more clarity of starting from index 1 to last index (n-1)
        for(int i =1; i<n;i++){
        
    >to understand better how this equation is created please dry run on paper with array and elements [a,b,c,d,e]
      >prefix[0] = 1;
      >prefix[1] = prefix[0]*nums[0]
      >prefix[2] = prefix[1]*nums[1]
          
    >Video solution:https://youtu.be/6GQEudo87tM?feature=shared
           prefix[i] = prefix[i-1]*nums[i-1];
            
        }
        
    >Similarly create suffix array but from the direction of last to first 
    >putting last element as 1
    >parse array from second last element to zeroth element
    
        suffix[n-1] = 1;
        for(int i=n-2;i>1;i--){
        
        
        >dry run to catch pattern 
        >suffix[n-2]=suffix[n-1]*nums[n-1] that means
            suffix[i] = suffix[i+1]*nums[i+1];
        }
    
    
        
        Now that we have gotten product of previous elements and next elements we can multiply them to get value of result array :0 yayayyayayaaay
        
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
        ans[i] = prefix[i]*suffix[i];
        }
        
        
      return ans;  
    }
}
}*/



class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        
        prefix[0] = 1;
        for(int i =1; i<n;i++){
            prefix[i] = prefix[i-1]*nums[i-1];
            
        }
        
        
        suffix[n-1] = 1;
        for(int i=n-2;i>=0;i--){
              suffix[i] = suffix[i+1]*nums[i+1];
        }
        
           
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
        ans[i] = prefix[i]*suffix[i];
        }
        
        
      return ans;  
        
    }
}