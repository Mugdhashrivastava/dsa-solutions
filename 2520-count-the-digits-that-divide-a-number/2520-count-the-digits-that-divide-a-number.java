/* 
if you were to count only digits whtat would be the method??
1.Here I am taking the number and taking out its last digit by takng the reminder I get after deviding 10 (modulus) last digit = num %10
2.then I am reducing my actual number by 1 to end the loop (devide) num  = num/10
while reducing I am incrementing count each time (reduce num by 1 and increas count by 1)

class Solution {
    public int countDigits(int num) {
       int count = 0;
       int digit = 0;
       
       while(num!=0){
       
       digit = num%10;
       num = num/10;
       count++;
       }
       return count;
    }
}


Now we need to check if the digits we have taken out completely devides them or not and if they do we need to increase count (so we dont need to count the digits but only those one that devides)
if(original_num % dig == 0 ){
count++;
} 

Below I am writing the solution

*/
class Solution {
       public int countDigits(int num) {
  
           int count = 0;
           int tempNum = num;
           int digit = 0;
           
           
           while(tempNum != 0){
               
               digit = tempNum%10;
               
               if(num%digit==0){
                   count++;
               }
               
               tempNum = tempNum/10;
               
           }
           
           return count;
    }
}