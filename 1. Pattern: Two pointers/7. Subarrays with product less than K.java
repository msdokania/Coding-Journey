/*
Problem Statement

Given an array with positive numbers and a positive target number, find all of its contiguous subarrays whose product is less than the target number.

Example 1:

Input: [2, 5, 3, 10], target=30                                              
Output: [2], [5], [2, 5], [3], [5, 3], [10]                           
Explanation: There are six contiguous subarrays whose product is less than the target.
/*
/*
Time Complexity O(n*n)
Space complexity O(n)
*/
public static List<List<Integer>> findSubarrays(int[] nums, int k) {
    int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        int i=0, j=0;
        int product = 1;
        while(i<n)
        {
            product = product*nums[j];
            List<Integer> result = new ArrayList<>();
            if(product<k)
            {
                if(i==j) ans.add(Arrays.asList(nums[i]));
                else
                {
                    for(int x=i; x<=j; x++) result.add(nums[x]);
                    ans.add(result);
                }
                if(j<n-1) j+=1;
                else{
                    i+=1;
                    j=i;
                    product=1;
                }
            }
            else
            {
                i+=1;
                j=i;
                product=1;
            }
        } 
        return ans; 
  }
