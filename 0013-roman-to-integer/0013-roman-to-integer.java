



class Solution {
    public int romanToInt(String s) {
        
       //make a hashmap to put characters and integers given
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        //initialise answer by 0
        int ans = 0;
        
        //iterating the whole string
        for(int i=0;i<s.length();i++ ){
            
            //if current index is less than last index (to prevent going from out of bound) AND the value in current index is less than value in just next index
            if(i < s.length()-1 && map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                
                //then decrease the current value from answer
                ans = ans-map.get(s.charAt(i));
            }else{
                //else you can add the current value in current index to ans
                ans = ans + map.get(s.charAt(i));
            }
        }
        
        //return answer
        return ans;
    }
}