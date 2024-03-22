/*what is palindrome?? 
It means reverse of number = number
* That means  we need to reverse the number 
 Approach of reversing :
 1.take out the last digit by taking the modulus of number when dvided by 10 (remainder of number when devided by 10 gives last digit)
             dig = tempx % 10;
 2.keep adding the last digit you took out in 10th multiple of previous number
                reverse = reverse*10+dig;
                
 3.keep doing this until digit becomes 0 (while loop)
 4. remeber to store the  original number in some temporary variable initially to keep our original number unchanged
  int tempx = x;
 5.reduce the number by deviding it by 10 at each iteration
               tempx = tempx/10;
               
        int dig = 0;
        int reverse = 0;
        int tempx = x;
        
        
        while(tempx!=0){
            
            dig = tempx % 10;
            reverse = reverse*10+dig;
        
            tempx = tempx/10;
            
            
        }

Now that the number is reversed compare it with original if it is equal to original number then itt is pallindrome so return true
      
      
       if(reverse==x){
            return true;
        }
        
The edge case: according to the question we can see negative number cant be palindrome so return false in that  case

  
        
        if(x<0){
            return false;
        }
        
Also return false in any other case at  the end

 
*/





class Solution {
    public boolean isPalindrome(int x){
        
        
        
        if(x<0){
            return false;
        }
        
        
        int dig = 0;
        int reverse = 0;
        int tempx = x;
        
        
        while(tempx!=0){
            
            dig = tempx % 10;
            reverse = reverse*10+dig;
        
            tempx = tempx/10;
            
            
        }
        
        if(reverse==x){
            return true;
        }
        return false;
    }
}