/* revision:
char:8 bit
short:16bit
int/long/float:32 bit
double:64bit

1. To reverse an integer we should first be able to take out the last digits by taking remainder of number when devided by 10
2. reduce the number by 1 digit each time by deviding it by 10 in each iteration
3. Here I have taken temporary variable temp_x to perform these operation on x without alteraing the original number(good practise)

class Solution {
    public int reverse(int x) {
      
        int temp_x = x;
        int lastDigit  = 0;
        
        
        
        while(temp_x != 0){
            
            lastDigit = temp_x%10;
            
        
            
            temp_x = temp_x/10;
            
        }
        return answer;
    }
}


4. Now that we can take out last digits one by one we must know how to add them to find the reverse of the given integer 
5. so what we will do is we would add the last last digit one by one to answer 
6. but to make them separate integer we need to multiply 10 to previous answer before adding to current last digit 

So here is the final solution which works for
1.negative integer too as answer*10 = (-) and lastDigit = (-) so  (-) + (-) = (-) 
2. integer overflow : returning 0 if value goes out of range as explained in question statement
3. storing answer in long to increase range of answer to 64 bit as reversed number could be grater than the current number
*/






class Solution {
    public int reverse(int x) {
      
        int temp_x = x;
        int lastDigit  = 0;
        long answer = 0;
        
        
        while(temp_x != 0){
            
            lastDigit = temp_x%10;
            
            answer = answer*10 + lastDigit;
            
            temp_x = temp_x/10;
            
        }
        
        if(answer>Integer.MAX_VALUE || answer<Integer.MIN_VALUE ){
            return 0;
        }
        return  (int)answer;
    }
}