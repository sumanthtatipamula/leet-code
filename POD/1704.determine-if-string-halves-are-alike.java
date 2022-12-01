package POD;
/*
 * @lc app=leetcode id=1704 lang=java
 *
 * [1704] Determine if String Halves Are Alike
 *
 * https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
 *
 * algorithms
 * Easy (78.36%)
 * Likes:    755
 * Dislikes: 51
 * Total Accepted:    106.7K
 * Total Submissions: 137.3K
 * Testcase Example:  '"book"'
 *
 * You are given a string s of even length. Split this string into two halves
 * of equal lengths, and let a be the first half and b be the second half.
 * 
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i',
 * 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and
 * lowercase letters.
 * 
 * Return true if a and b are alike. Otherwise, return false.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "book"
 * Output: true
 * Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel.
 * Therefore, they are alike.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "textbook"
 * Output: false
 * Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2.
 * Therefore, they are not alike.
 * Notice that the vowel o is counted twice.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 2 <= s.length <= 1000
 * s.length is even.
 * s consists of uppercase and lowercase letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean halvesAreAlike(String s) {
        int firstHalf = 0;
        int secondHalf = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (i < len / 2) {
                firstHalf += isVowel(s.charAt(i)) ? 1 : 0;
            } else {
                secondHalf += isVowel(s.charAt(i)) ? 1 : 0;
            }
        }
        return firstHalf == secondHalf;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'u' || c == 'i' || c == 'o' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
// @lc code=end

