package com.shomis.simpletest.leetcode;

import java.util.HashMap;

import org.springframework.util.StringUtils;

/**
 * 无重复字符的最长子串
 *
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        int result = lengthOfLongestSubstring("dvdf");

        System.out.println(result);
    }

    public static int lengthOfLongestSubstring(String s) {

        if (s == null || "".equals(s)) {
            return 0;
        }

        int max = 1;

        int[] tmp = new int[256];

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] == chars[i] || tmp[chars[j]] == 1) {
                    tmp = new int[256];
                    break;
                }
                tmp[chars[j]] = 1;

                if (j - i >= max) {
                    max = j - i + 1;
                }
            }
        }

        return max;
    }

}
