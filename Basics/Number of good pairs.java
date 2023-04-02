/*
Problem Statement
Given an array of integers nums, return the number of good pairs in it.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs, here are the indices: (0,3), (0,4), (3,4), (2,5).
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array is a 'good pair'.
*/

/*
Time complexity O(n)
Space complexity O(n)
*/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        Map<Integer, List<Integer>> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            if(!hm.containsKey(nums[i])) hm.put(nums[i], new ArrayList(Arrays.asList(i)));
            else
            {
                List<Integer> tmp = hm.get(nums[i]);
                ans += tmp.size();
                tmp.add(i);
                hm.put(nums[i], tmp);
            }
        }
        return ans;
    }
}
