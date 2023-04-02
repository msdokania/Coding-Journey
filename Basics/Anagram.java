/*
Problem Statement
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "listen", t = "silent"
Output: true
*/

/*
Time Complexity O(n)
Space Complexity O(1)
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] num = new int[26];
        if(s.length() != t.length()) return false;
        for(int i=0; i<s.length(); i++)
        {
            num[s.charAt(i)-'a']++;
            num[t.charAt(i)-'a']--;
        }
        for(int x : num)
            if(x!=0) return false;
        return true;
    }
}
