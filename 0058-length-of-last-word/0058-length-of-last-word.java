class Solution {
    public int lengthOfLastWord(String s) {
        //remove extra spaces from start and end 
        s = s.trim();
        //to store the length of the last word
        int count = 0;
        
        //loop from last index of loop 
        for(int i=s.length()-1;i>=0;i--){
            
            
            //if current character is not space then increase the count 
            if(s.charAt(i) != ' '){
                count++;
            }
            //else if current character is space then break and return the count as it means last word is ended 
            else{
               break;
            }
        }
    
        return count;
    }
}