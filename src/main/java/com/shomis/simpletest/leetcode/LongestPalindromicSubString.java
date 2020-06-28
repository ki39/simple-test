package com.shomis.simpletest.leetcode;

import java.util.Arrays;

import org.springframework.util.StringUtils;

/**
 * 最长回文子串
 *
 *
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 *
 *
 * "adfggfda"
 *
 *
 *
 * "aaaaaaavfgfvaaava"
 */
public class LongestPalindromicSubString {

    public static void main(String[] args) {

        long start = System.nanoTime();
        System.out.println(longestPalindrome2("rgczcpratwyqxaszbuwwcadruayhasynuxnakpmsyhxzlnxmdtsqqlmwnbxvmgvllafrpmlfuqpbhjddmhmbcgmlyeypkfpreddyencsdmgxysctpubvgeedhurvizgqxclhpfrvxggrowaynrtuwvvvwnqlowdihtrdzjffrgoeqivnprdnpvfjuhycpfydjcpfcnkpyujljiesmuxhtizzvwhvpqylvcirwqsmpptyhcqybstsfgjadicwzycswwmpluvzqdvnhkcofptqrzgjqtbvbdxylrylinspncrkxclykccbwridpqckstxdjawvziucrswpsfmisqiozworibeycuarcidbljslwbalcemgymnsxfziattdylrulwrybzztoxhevsdnvvljfzzrgcmagshucoalfiuapgzpqgjjgqsmcvtdsvehewrvtkeqwgmatqdpwlayjcxcavjmgpdyklrjcqvxjqbjucfubgmgpkfdxznkhcejscymuildfnuxwmuklntnyycdcscioimenaeohgpbcpogyifcsatfxeslstkjclauqmywacizyapxlgtcchlxkvygzeucwalhvhbwkvbceqajstxzzppcxoanhyfkgwaelsfdeeviqogjpresnoacegfeejyychabkhszcokdxpaqrprwfdahjqkfptwpeykgumyemgkccynxuvbdpjlrbgqtcqulxodurugofuwzudnhgxdrbbxtrvdnlodyhsifvyspejenpdckevzqrexplpcqtwtxlimfrsjumiygqeemhihcxyngsemcolrnlyhqlbqbcestadoxtrdvcgucntjnfavylip"));
        long end = System.nanoTime();
        System.out.println((end-start)/1000000);

    }

    public static String longestPalindrome(String s) {
        int max = 0;
        String maxStr = "";
        char[] chars = s.toCharArray();

        for (int i = 0; i <= chars.length; i++) {
            if(max>chars.length/2){
                break;
            }


            for (int j = i; j <= chars.length; j++) {
                char[] chars1 = Arrays.copyOfRange(chars, i, j);
                if (isPalindrome(chars1) && chars1.length > max) {
                    max=chars1.length;
                    maxStr = String.valueOf(chars1);
                }
            }

        }

        return maxStr;
    }

    public static boolean isPalindrome(char[] a) {


        for (int i = 0; i < a.length; i++) {
            if (a[i] != a[a.length - i - 1]) {
                return false;
            }
        }
        return true;
    }



    private static int lo, maxLen;

    public static String longestPalindrome2(String s) {
        int len = s.length();
        if (len < 2)
            return s;

        for (int i = 0; i < len-1; i++) {
            extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
            extendPalindrome(s, i, i+1); //assume even length.
        }
        return s.substring(lo, lo + maxLen);
    }

    private static void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }
}
