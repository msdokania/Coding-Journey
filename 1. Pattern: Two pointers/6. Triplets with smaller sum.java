/*
Triplets with Smaller Sum (medium)
Problem Statement

Given an array arr of unsorted numbers and a target sum, count all triplets in it such that arr[i] + arr[j] + arr[k] < target where i, j, and k are three different indices. Write a function to return the count of such triplets.

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
    public int search(int[] nums, int l, int r, int to_find)
    {
        int sum = 0;
        while(l<r)
        {
            if(nums[l]+nums[r]<to_find)
            {
                sum += r-l;
                l++;
            }
            else r--;
        }
        return sum;
    }
    public int threeSumSmaller(int[] nums, int target) {
        int n = nums.length;
        int count = 0;
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++)
        {
            count += search(nums,i+1,n-1, target-nums[i]);
        }
        return count;
    }
}
