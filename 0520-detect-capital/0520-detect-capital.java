/* approach :  we will use a variable to store count of variable then we will iterate whole loop of string to count capitals 

1. if the count turns out to be "0" that means everthing is in lowercase so we will return true
2. if the count turns out be same as length of the word that means everything is capital so we will return true
3. if the count is '1' we need to check if it is initial letter of word or not if it is then we will return true else False in all of the rest case



Pre requisite knowledge :

 ASCII value of lowercase : a - '97' to z : '122'
 ACII value of uppercase : A : '65' to Z: '90'*/



class Solution {
    public boolean detectCapitalUse(String word) {
        
   
      //count uppercase
        int count = 0;
        int n = word.length();
        
        
        
    //out of constraint but still lets write edge case for empty string 
        if(n==0){
            return true;
        }
        
        //loop through whole string
        for(int i = 0; i<n;i++){
            
            //int ascii value at index i
            int ch = word.charAt(i);
            
            //if value lies between value of uppercase value range 
            if(ch>=65 && ch<=90){
                count++;
            }
        }
        
        
        //if all are uppercase OR all are lowercase return true
        if(count == n || count==0){
            return true;
        }
        
        //store initial characters integer ascii value 
        int initial = word.charAt(0);
        
        //if uppercase count is 1 and its initial value is the only uppercase value then return true 
        if(count==1 && initial >= 65 && initial <=90){
            return true;
        }
        
        
        //return false in all the cases
        return false;
        
        
    
    }
}