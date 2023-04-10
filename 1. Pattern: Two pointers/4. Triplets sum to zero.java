/*
Problem Statement

Given an array of unsorted numbers, find all unique triplets in it that add up to zero.

Example 1:

Input: [-3, 0, 1, 2, -1, 1, -2]
Output: [[-3, 1, 2], [-2, 0, 2], [-2, 1, 1], [-1, 0, 1]]
Explanation: There are four unique triplets whose sum is equal to zero. smallest sum.'
*/
/*
Time Complexity O(nlog(n))
Space complexity O(n)
*/
class Solution {
    public List<List<Integer>> searchTriplets(int[] nums) 
    {
      List<List<Integer>> triplets = new ArrayList<>();
      int n = nums.length;
      Arrays.sort(nums);
      for(int i=0; i<n-3; i++)
      {
        if(nums[i+1]==nums[i]) continue;
        int l=i+1, r=n-1;
        int target = (-1) * nums[i];
        while(l<r)
        {
          if(nums[l]+nums[r] == target) 
          {
            triplets.add(new ArrayList<>(Arrays.asList(nums[i],nums[l],nums[r])));
            l++;
            r--;
          }
          else if(nums[l]+nums[r] < target) l++;
          else r--;
        }
      }
      return triplets;
    }
