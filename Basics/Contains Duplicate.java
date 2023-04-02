/*
Problem Statement
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums= [1, 2, 3, 4]
Output: false  
Explanation: There are no duplicates in the given array.

Example 2:
Input: nums= [1, 2, 3, 1]
Output: true  
Explanation: '1' is repeating.
*/

/*
Solution 1 -
Time Complexity O(n)
Space Complexity O(n)
*/
import java.util.HashSet;
import java.util.Set;

public class Solution {

  public boolean containsDuplicate(int[] nums) {
    int n = nums.length;
    Set<Integer> s = new HashSet<>();
    for(int i=0; i<n; i++)
    {
      if(s.contains(nums[i])) return true;
      s.add(nums[i]);
    }
    return false;
  }
}


/*
Solution 2 -
Time Complexity O(n * log(n))
Space Complexity O(1)
*/
import java.util.Arrays;

 class Solution {
     public boolean containsDuplicate(int[] nums) {
         Arrays.sort(nums);
         for (int i = 0; i < nums.length - 1; i++) {
             if (nums[i] == nums[i + 1]) {
                 return true;
             }
         }
         return false;
     }
 }
