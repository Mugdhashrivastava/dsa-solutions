/* Given: 2 versions (like upgrade versions) in form of string
           subpart of version between dots is referred to as reviions
           
  To do : compare both the versions in left to right order : if left part of x is greater than left part of y then x is greater and if equal then we will proceed to right part and so on 
  
    Rules to compare : 1. Ignore leading zeroes of each section/revision separated by dots 
                          leading zeroes : the zeroes that comes before the number in front 
                          EX: 00000001 = 1
                          
                       2. If nothing exists while comparison i.e. if a section/revision as empty then consider it as 0 to make comparison easier
                          Ex: 3.4 = 3.4.0.0.0 ...so on
                          
                       3. If version1 = version2 : return 0
                       4. If version1>version2 : return 1
                       5. If version1<version2 : return -1
                       
                       
Approach I used to solve: 1. Split the string by . to get separate sections and store it in array
2.Convert each section into integer : helps us to ignore leading zeroes automatically since they are not string but actual number
3. Compare each section inside loop and return desired value after compairing if unequal keep looping until end
4. when whole array is parsed and nothing got returned while looping that means both the versions are equal so return 0 in the end out of loop

                        
                        
  */




class Solution {
    public int compareVersion(String version1, String version2) {
        
      //split by . and store it in array
       String[] v1 = version1.split("\\.");
       String[] v2 = version2.split("\\.");
        
      //length of each array = number of revisions/sections
       int l1 = v1.length;
       int l2 = v2.length;
       
       //length of longest array 
        int longest = l1>l2 ? l1:l2;
        
        //iterate from start till end of longest array  (follows left to right rule as well)
        for(int i=0;i<longest;i++){
            
            //if a section has any value then convert it into integer else declare that section as 0 (RULE 2)
            int ver1 = i<l1?Integer.parseInt(v1[i]):0;
            int ver2 = i<l2?Integer.parseInt(v2[i]):0; 
            
            //compare each section and return as told if any conclusion is drawn otherwise keep on iterationg loop until end
            
            
            if(ver1>ver2){
                return 1;
            }
            
            
            if(ver1<ver2){
                return -1;
            }
            
         
        }
        
        
        //return 0 if nothing is returned while looping : that means both the versions are equal
           return 0;
        
    }
}