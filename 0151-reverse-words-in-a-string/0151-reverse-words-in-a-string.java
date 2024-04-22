class Solution {
    public String reverseWords(String s) {
        //trim() => removes spaces of sides => leading and trailing spaces
        //split(" ")=>split words separated by space
        
        //took array of String datatype to store values
        String[] words = s.trim().split(" ");
        
        //to store answer use Stringbuilder(we can do operations in it)
        StringBuilder sb = new StringBuilder();
        
        
        //loop from end , keep adding values from last of words to sb,add space after each addition
        for(int i=words.length-1;i>=0;i--){
            if(words[i].length()>0){   //if word has character instead of space
                sb.append(words[i]);
                sb.append(' ');
            }
        }
        
        
        
        
   //taking substring to avoid last space added after adding the last word
   //covernted to string according to return datatype
        
        return sb.substring(0,sb.length()-1).toString();
        
    }
}