/*
Problem Statement
A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing English letters (lower or upper-case), return true if sentence is a pangram, or false otherwise.
Note: The given sentence might contain other characters like digits or spaces, your solution should handle these too.

Example 1:
Input: sentence = "TheQuickBrownFoxJumpsOverTheLazyDog"
Output: true
Explanation: The sentence contains at least one occurrence of every letter of the English alphabet either in lower or upper case.

Example 2:
Input: sentence = "This is not a pangram"
Output: false
Explanation: The sentence doesn't contain at least one occurrence of every letter of the English alphabet.
*/

/*
Solution 1 -
Time Complexity O(n)
Space Complexity O(1)
*/
class Solution {
  public boolean checkIfPangram(String sentence) {
    sentence = sentence.replaceAll("[^a-zA-Z]","");
    sentence = sentence.toLowerCase();
    int[] alphabets = new int[26];
    for(int i=0; i<sentence.length(); i++)
    {
      int idx = (int)sentence.charAt(i) - 97; // (int)char converts to ASCII value
      alphabets[idx] = 1;
    }
    for(int i=0; i<26; i++)
      if(alphabets[i]==0) return false;
    return true;
  }
}

/*
Solution 2 -
Time Complexity O(n)
Space Complexity O(1)
*/
import java.util.HashSet;
import java.util.Set;

class Solution {
  public boolean checkIfPangram(String sentence) {
    Set<Character> seen = new HashSet<>();
    for (char currChar : sentence.toLowerCase().toCharArray()) {
        if (Character.isLetter(currChar)) {
          seen.add(currChar);
      }
    }
    return seen.size() == 26;
  }
}
