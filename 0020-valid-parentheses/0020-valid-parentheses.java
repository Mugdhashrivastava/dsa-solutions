/* valid parenthesis condition : 1. the string should be even in number since they are in pair
2. The one opened last should be closed first (looks like a stack problem aint it???)
3. every opened bracket should be closed

Approach: we will make stack of characters and iterate over each character of string
1. We will push the character in stack if its an opening bracket
2. If we encounter the closing bracket we will check if equates to its opposite pair of the bracket at the top of stack
3. If yes we will pop the opening bracket at top 
4.similarly we would be keep checking until the stack gets emppty
5.return true if stack gets empty
6.return false if anywhere the closing bracket doesnt match with the top of stack as its opposite bracket
*/

class Solution {
    public boolean isValid(String s) {
        
        //if strinf is odd return false right away
        if(s.length()%2!= 0){
           return false; 
        }
        
        
        //make a stack of characters 
        Stack<Character> stack = new Stack();
        
        //convert string to charArray to to do operations onto it and iterate loop over it
        for(char c: s.toCharArray()){
            
            //while iterating if you find opening bracket then push it to stack
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            
            //else if its closing bracket of its corresponding pair then pop out the top value of stack.Make sure to do match making of pairs right
            else if(c==')' && !stack.isEmpty() && stack.peek()=='(' ){
                stack.pop();
            }
            
            
            else if(c=='}' && !stack.isEmpty() && stack.peek()=='{' ){
                stack.pop();
            }
            
           else if(c==']' && !stack.isEmpty() && stack.peek()=='[' ){
                stack.pop();
            }
            
            //while iterating through the charArray if you found a char who is a closing bracket but doesnt have its opening bracket at top of stack(not in sequence) or they are just extra pair of closing bracket ,return false
            else{
                return false;
            }
        }
        
        //return true if stack gets empty and false if it doesnt after iterating all of string
        return stack.isEmpty();
        
        
    }
}