/*
Problem Statement
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

Example 1:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.8284, and since we need to return the floor of the square root (integer), hence we returned 2.
*/

/*
Time Complexity O(log(n))
Space Complexity O(1)
*/

class Solution {
    public int mySqrt(int x) {
        if(x<=1) return x;
        int l=1, r=x/2;
        int mid = (r-l)/2 + l;
        while(l<=r)
        {
            long sq = (long) mid*mid;
            if(sq == x) return mid;
            if(sq>x) r=mid-1;
            else l=mid+1;
            mid = (r-l)/2 + l;
        }
        return mid-1;
    }
}

