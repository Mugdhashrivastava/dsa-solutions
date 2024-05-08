/*Subsequence: subset but in similar order of letters like in actual string 


approach : we will keep pointer on subsequence s and total t . 
1. In string s we would increment the pointer if the current char of s matches the current char of t 
2. After every iteration we would increment the pointer in t
3. If pointer in s reaches the end whether or not t reaches then s is subsequence of t*/


class Solution {
    public boolean isSubsequence(String s, String t) {
        
        
        //initialise index for pointers at strings s and t
        int sIdx = 0;
        int tIdx = 0;
        
        
        //while loop till tIndx reaches the end
        while(tIdx<t.length()){
            
         
              //Edge Case: If s is an empty string (s.length() is 0), the condition sIdx == s.length() would immediately return true, indicating that an empty string is always a subsequence of any other string. This is also good for optimization and prevent t from incrementing further when found true
            if(sIdx == s.length()){
                return true;
            }
            
             // we would increment the pointer of s string if the current char of s matches the current char of t 
            if(s.charAt(sIdx)==t.charAt(tIdx)){
                sIdx++;
                
            }
              
            
            
            
            //increment pointer at t anyway at each interation
            tIdx++;  
            
            
            
          
        }
        
        
        //if pointer index of s and length is equal then it is susequence : that means all the char of s has been parsed in order
        return sIdx == s.length();
    }
}