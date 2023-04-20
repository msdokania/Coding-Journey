/*
Dutch National Flag Problem (medium)
Problem Statement

Given an array containing 0s, 1s and 2s, sort the array in-place. You should treat numbers of the array as objects, hence, we can’t count 0s, 1s, and 2s to recreate the array.

The flag of the Netherlands consists of three colors: red, white and blue; and since our input array also consists of three different numbers that is why it is called Dutch National Flag problem.

Basically, your goal is to sort an array of 0, 1 and 2's but you must do this in place, in linear time and without any extra space (such as creating an extra array). This is called the Dutch national flag sorting problem.

Example 1:

Input: [1, 0, 2, 1, 0]
Output: [0 0 1 1 2]
Example 2:

Input: [2, 2, 0, 1, 2, 0]
Output: [0 0 1 2 2 2 ]
*/
/*
Time Complexity O(n)
Space complexity O(1)
*/
public static void sort(int[] arr) {
    int n = arr.length;
    int i=0, k=0, j=n-1;
    while(i<=j)
    {
      if(i==0)
      {
        int tmp = arr[i];
        arr[i] = arr[k];
        arr[k] = arr[i];
        k++;
        i++; 
      }
      else if(i==1) i++;
      else
      {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = arr[i];
        j--;
        i++;
      }
    }
  }
