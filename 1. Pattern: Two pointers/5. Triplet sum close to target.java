/*
Problem Statement

Given an array of unsorted numbers and a target number, find a triplet in the array whose sum is as close to the target number as possible, 
return the sum of the triplet. If there are more than one such triplet, return the sum of the triplet with the smallest sum.
Example 1:

Input: [-1, 0, 2, 3], target=3 
Output: 2
Explanation: There are two triplets whose sum is less than the target: [-1, 0, 3], [-1, 0, 2]
*/
/*
Time Complexity O(n*n)
Space complexity O(n)
*/
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min_diff = Integer.MAX_VALUE;
        int ans = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++)
        {
            if(i!=0 && nums[i-1]==nums[i]) continue;
            int l=i+1, r=n-1;
            while(l<r)
            {
                int curr_sum = nums[i]+nums[l]+nums[r];
                if(Math.abs(curr_sum-target) < min_diff)
                {
                    ans = curr_sum;
                    min_diff = Math.abs(curr_sum-target);
                }
                if(nums[l]+nums[r] > target-nums[i]) r--;
                else l++;
            }
        }
        return ans;
    }
}
