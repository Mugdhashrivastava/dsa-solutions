/*

so we need to return ArrayList of bolean datatype so lets create answer arraylist to store answer

 List<Boolean> ans = new ArrayList<>();
 
 1.Take out the maximum candies of  the given array someone has got 
 Why??
 Since  we need to compare the candies of each element + extraCandies given with maximum candies
 
 How??
 Assume any element to be max in array then compare with each element in array with that if its greater than assumed value then replace it with assumed max
 
   int max = candies[0];
        for(int i = 1;i<candies.length;i++){
            if(max<=candies[i]){
                max = candies[i];
            }
        }
        
2.Now run foreach loop for each element of candies where add each element with extraCandies(given)  
3.compare the sum with max value, make an expression so it can only if boolean value: true or false(val+extraCandies>=max)
4.Add the given boolean value to arrayList ans

 for(int val : candies){
          ans.add(val+extraCandies>=max);
      }
      
5.reurn the answer yayayyayayyayayay!!!!!

 

*/






class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        
        List<Boolean> ans = new ArrayList<>();
        
     int max = candies[0];
        for(int i = 1;i<candies.length;i++){
            if(max<=candies[i]){
                max = candies[i];
            }
        }
        
      for(int val : candies){
          ans.add(val+extraCandies>=max);
      }
        
        
        return ans;
    }
}