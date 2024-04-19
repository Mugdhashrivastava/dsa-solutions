/*
Given: string
To do: reversal of only vowels
approach:2 pointer
method: 
1.take one pointer from left and one from right
2.move them ahead if its consonant
3.if its vowel then dont move 
4.when both right and left gets equal to vowel then swipe and move ahead*
5. repeat this process until left and right surpasses each other
Video solution :https://www.youtube.com/watch?v=9cl3tne0rNU

 




*/




class Solution {
    public String reverseVowels(String s) {
        
        
        //converting string to array of chars
        char[] myArr = s.toCharArray();
        
        //two pointer
        int left = 0;
        int right = myArr.length-1;
        
        while(left<right){
            
            //characters at current pointer of left and right
            char chL = myArr[left];
            char chR = myArr[right];
            
           
            if(isVowel(chL) && isVowel(chR)){              //if both are vowels
                
                
                //remember to put char into location(myArr(i)) not locationn into char 
                myArr[right] = chL;
                myArr[left] =chR;
                left++;
                right--;
                
              
            }else if(isVowel(chL)){                        //left char is vowel 
                right--;
              

            }else if(isVowel(chR)){                        //right char is vowel
                left++;
              
              
            }else{                                        //neither is vowel
                left++;
                right--;
            }
            
            
        }
        
        
        
        return new String(myArr);
        
    }
    
    

    
    
//function to check if character is vowel or not

Boolean isVowel(char ch){
    if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
      return true;
    }
    return false;
}
}