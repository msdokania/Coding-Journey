/*
Problem Statement
Given an array of sorted numbers, remove all duplicate number instances from it in-place, such that each element appears only once. The relative order of the elements should be kept the same and you should not use any extra space so that the solution has a space complexity of .

Move all the unique elements at the beginning of the array and after moving return the length of the subarray that has no duplicate in it.

Example 1:

Input: [2, 3, 3, 3, 6, 9, 9]
Output: 4
Explanation: The first four elements after removing the duplicates will be [2, 3, 6, 9].
Example 2:

Input: [2, 2, 2, 11]
Output: 2
Explanation: The first two elements after removing the duplicates will be [2, 11].
*/

/*
Time complexity O(n)
Space complexity O(1)
*/

class Solution {

  public static int remove(int[] arr) {
    int n = arr.length;
    if(n<=1) return n;
    int j = 0, i=1;
    while(i<n)
    {
      if(arr[i]==arr[j]) i++;
      else
      {
        j++;
        arr[j] = arr[i];
        i++;
      }
    }
    return j+1;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 2, 3, 3, 3, 6, 9, 9 };
    System.out.println(Solution.remove(arr));

    arr = new int[] { 2, 2, 2, 11 };
    System.out.println(Solution.remove(arr));
  }
}
