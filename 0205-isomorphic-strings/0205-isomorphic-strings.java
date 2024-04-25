/* Given: 1.s and t are isomorphic when characters of s are encoded in t
2.sequence of real string and encoded string should be same
3.there should be one to one relationship between s and t,no 2 characters should be encoded to same letter and no letter should be encoded to 2 different letters
4.a letter can be encoded to itself
One to one or bi directional mapping

reference :https://youtu.be/ogTMIFPjNkQ?feature=shared


solution : we will make 2 hashmaps : remember a hashmap cannot have 2 same keys but they can have 2 same values to two different values 
Basically, keys needs to be unique,values doesnt
So this is why we will be needing 2 different hashmaps since we have one to one relationship bi-directionally
hashmap1 = will keep all the unique keys of string s and map it to t's values so anytime when we will map s and t , if s would be repeated with differente  value of t it would exploit the rule of hashmap since key of s should be unique so we will return false if it doesnt repeat then we will continue till end
Hashmap2 = this hashmap take keys of second string t and will check if its visited by us or not during mapping ,since keys cant be repeated so if values of 't' will be repeated we will return false */



class Solution {
    public boolean isIsomorphic(String s, String t) {
        //return false if string lengths s and t are uneqal that means some characters are not mapping to anything then they can never be isomorphic
        if(s.length() != t.length()){
            return false;
        }
        
        
        //make hashmap of char of s(unique keys) and char of t(values)
        HashMap<Character,Character> map = new HashMap<>();
        //hashmap of char of t(unique keys) and boolean(value) to check if it is repeated or not
        HashMap<Character,Boolean> visited = new HashMap<>();
        
        
        for(int i=0;i<s.length();i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            
            if(map.containsKey(charS)){
               if(map.get(charS)!=charT){
                   return false;
               }
            }

            
            
            
            else {
                if(visited.containsKey(charT)){
                    return false;
                }
                
                map.put(charS,charT);
                visited.put(charT,true);
            }
        }
        
        return true;
        
    }
}