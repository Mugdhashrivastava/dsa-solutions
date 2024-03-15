/* Given: 2 strings : word1 , word2
   To do : merge the letters alternatively 
   if : any string is longer add in end
   
   
   approach for beginners: ignore word1 and word2 assume theres only word1 
                        now how will you add each letter to empty string
                        
   class Solution {
    public String mergeAlternately(String word1, String word2) {
        String output = "";
      
        
        for(int i = 0; i<word1.legth(); i++){
            
                
            output = output + word1.charAt(i);
        
            
            
        }
        return output;
    }
}                     
                        
       
   Now think how are you gonna add other string this is how i thought      
       
       
       class Solution {
    public String mergeAlternately(String word1, String word2) {
        String output = "";
        int maxLength = Math.max(word1.length(),word2.length());
        
        for(int i = 0; i<maxLength;i++){
            
                
            output = output + word1.charAt(i) + word2.charAt(i);
        
            
            
        }
        return output;
    }
}
            
            
            
            
but you can check this is only gonna work fo strings of equal length so we need to introduce if else for different lengths of both strings.So here is the final solution:







                        */



class Solution {
    public String mergeAlternately(String word1, String word2) {
        String output = "";
        int maxLength = Math.max(word1.length(),word2.length());
        
        for(int i = 0; i<maxLength;i++){
            
                
         if(i<word1.length()){
        
            output += word1.charAt(i);
            
        }
        
        if(i<word2.length()){
            output += word2.charAt(i);
        }
        }
        return output;
    }
}