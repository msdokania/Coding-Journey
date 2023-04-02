/*
Problem Statement
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: sentence = "A man, a plan, a canal, Panama!"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
*/

/*
Time Complexity O(n)
Space Complexity O(n)
*/

class Solution {
    public boolean isPalindrome(String s) {
       s = s.toLowerCase();
       s = s.replaceAll("[^a-z0-9]", "");
       StringBuilder sb = new StringBuilder(s);
       String rev = String.valueOf(sb.reverse());
       if(s.equals(rev)) return true;
       return false;
    }
}

// OR

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(Character ch : s.toCharArray())
        {
            if(Character.isLetterOrDigit(ch))
            {
                sb.append(ch);
            }
        }
        String new_s = sb.toString();
        String rev_s = sb.reverse().toString();
        if(new_s.compareTo(rev_s)==0) return true;
        return false;
    }
}

