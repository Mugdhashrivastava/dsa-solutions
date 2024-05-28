class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
     
        
        //Create stingBuilder as they are mutable: these str1 and str2 will have combined array of  word1 and word2
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        
        //for loop in word1 to append every character into str1
           for(String word : word1){
            str1.append(word);
        }
        
        
    //for loop in word2 to append every character into str2 
        for(String word : word2){
            str2.append(word);
        }
        //convert stringBuilder to string again 
        String s1 = str1.toString();
        String s2 = str2.toString();

        //if they are equal then return true else false
        if(s1.equals(s2)){
            return true;
        }
        else{
            return false;
        }
    
        
        
    }
}