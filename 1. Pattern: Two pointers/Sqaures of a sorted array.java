/*
Problem Statement
Given a sorted array, create a new array containing squares of all the numbers of the input array in the sorted order.

Example 1:

Input: [-2, -1, 0, 2, 3]
Output: [0, 1, 4, 4, 9]
*/
/*
Time complexity O(n)
Space complexity O(n)
*/
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int l=0, r=n-1;
        int i=n-1;
        while(l<=r)
        {
            int num1 = nums[l]*nums[l];
            int num2 = nums[r]*nums[r];
            if(num1>num2)
            {
                ans[i--] = num1;
                l++;
            }
            else
            {
                ans[i--] = num2;
                r--;
            }
        }
        return ans;
    }
}
