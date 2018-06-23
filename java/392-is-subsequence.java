/*
 Source : https://leetcode.com/problems/is-subsequence
 Author : Alex Xu
 Date   : Jun 23, 2018
 Problem: Given a string s and a string t, check if s is subsequence of t.

You may assume that there is only lower case English letters in both s and t. t is potentially a very long (length ~= 500,000) string, and s is a short string (<=100).

A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
s = "abc", t = "ahbgdc"

Return true.

Example 2:
s = "axc", t = "ahbgdc"

Return false.

Follow up:
If there are lots of incoming S, say S1, S2, ... , Sk where k >= 1B, and you want to check one by one to see if T has its subsequence. In this scenario, how would you change your code?

Solution:
1. get char sequence from S 
2. check if char S[i] exists in T_remain

Runtime: 2ms, beats 100%
*/

class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s == null || t == null || s.length() > t.length()) {
            return false;
        }
        
        int index = -1;
        for (int i=0; i<s.length(); i++) {
            index = t.indexOf(s.charAt(i), index+1);
            if (index == -1) {
                return false;
            }
        }
        
        return true;
    }
}
