/*
Problem Statement
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:
Input: s= "hello"
Output: "holle"
*/

/*
Solution 1 - HashSet
Time Complexity O(n)
Space Complexity O(m) where m is the number of vowels in the string
*/
class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        Stack<Character> store = new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(vowels.contains(c)) store.add(c);
        }
        if(store.size()==0) return s;
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(vowels.contains(c))
                s = s.substring(0, i)+store.pop()+ s.substring(i + 1);
        }
        return s;
    }
}

/*
Solution 2 - 2 pointer
Time Complexity O(n)
Space Complexity O(m) where m is the number of vowels in the string
*/
class Solution {
    boolean isVowel(char c) {
        return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u'
            || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U';
    }
    public String reverseVowels(String s) {
        int l = 0, r=s.length()-1;
        char[] ch = s.toCharArray();
        while(l<r)
        {
            if(isVowel(ch[l]) && isVowel(ch[r]))
            {
                char tmp = ch[l];
                ch[l] = ch[r];
                ch[r] = tmp;
                l++;
                r--;
            }
            else if(isVowel(ch[l])) r--;
            else if(isVowel(ch[r])) l++;
            else
            {
                l++;
                r--;
            }
        }
        return new String(ch);
    }
}
