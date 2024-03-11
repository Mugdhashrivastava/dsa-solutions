/* we are iterating our array , 
1.take an integer x to store the count of elements that are not val
2.initially initialize the x with zero 0 
3. we will compare the element at each index in array with val
4. if the array element is not equal to val take it to front of array so that all the vals will be at back of array. how???
5. replace the arrays element index with our index x which we initialized at zero
6. after replacing the index, increment index x by one with each iteration
7. after iterating all the elements return the value of index x that will be count of the non val elements

Here in solution I aint using x  but index. I took x in explanation to not confuse you all


Concept : we are taking an index  x from zero , putting the non val element in that index and incrementing it.After that we are again putting the non val element in index x  which is now 1 and again incrementing it.
In this way we are repeating the process for all the elements in array 

after last iteration of replacing index, index x will be = nums.length-1 but then we are incrementing again inside loop for the last time

So remember to return index x outside the loop after it has incremented fr all the times 

*/


class Solution {
    public int removeElement(int[] nums, int val) {
        
        int index = 0;
        for(int i=0; i<nums.length;i++){
          if(nums[i] != val){
              nums[index] = nums[i];
              index++;
          }
        }
     return index;   
    }
}