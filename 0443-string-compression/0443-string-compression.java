/*Given: array of chars
  To do: 1. compress in a way if frequency of char is one : put only that char in string 
                           if frequency of char is two or more: put that char in string s then put its frequency
         2. put string in array of char 
         3. if frequency is 10 or more it should be stored 1 and 0 differently as a char in array
        */
class Solution {
    public int compress(char[] chars) {
        
        //create empty string sb using StringBuilder
        StringBuilder ansSb = new StringBuilder();
        
        //initialize from first index
        int idx = 1;
        int count =1;
        
        //append first char from array 'char'
        ansSb.append(chars[0]);
        
        
        //loop till index idx is last index of chars.length-1 (chars is name of array given to us)
        while(idx<chars.length){
            
            //comparing from previous element since we are starting from 1 and also we are preventing it from going out of bound for last element if it was compairing from next element 
            
            //if they are equal increase the frequency 
            if(chars[idx]==chars[idx-1]){
                count++;
            }
            
            //else if they are different then add count(this count is of previous element) to result and current char to ansSb and renew count to 1 again
            else{
             
                //edge case: dont append count frequency if its one
               if(count !=1) {
                ansSb.append(count);
               }
                ansSb.append(chars[idx]);
                count = 1;
               
            }
          
            
            
            
          idx++;  
        }
        
        
        
        
        //add the frequency count of last character
        if(count !=1){
            ansSb.append(count);
        }
        
        //changing te original array as required by the question .Putting values of our answer string inside array but only from 0 till ansSb.length()-1
        for(int j=0;j<ansSb.length();j++){
            chars[j] = ansSb.charAt(j);
        }
        
        //Returning ansSb.length() which is part of array now.We cannot return chars.length because chars can be of much larger length with repeated frequencies of character however we only replaced till ansSb.length() which could be of much shorter due to filteration of repeatation and single characters
        return ansSb.length();
        
    }
}