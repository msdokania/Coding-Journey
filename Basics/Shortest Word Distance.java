/*
Problem Statement
Given an array of strings words and two different strings that already exist in the array word1 and word2, return the shortest distance between these two words in the list.
Example 1:

Input: wordsDict = ["practice", "makes", "perfect", "coding", "makes"], word1 = "coding", word2 = "practice"
Output: 3
Example 2:

Input: wordsDict = ["practice", "makes", "perfect", "coding", "makes"], word1 = "makes", word2 = "coding"
Output: 1
*/

/*
Time Complexity O(n)
Space Complexity O(1)
*/

class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int idx1=-1, idx2=-1;
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<wordsDict.length; i++)
        {
            if(wordsDict[i].equals(word1)) idx1=i;
            else if(wordsDict[i].equals(word2)) idx2=i;
            if(idx1!=-1 && idx2!=-1) ans = Math.min(ans, Math.abs(idx2-idx1));
        }
        return ans;
    }
}
