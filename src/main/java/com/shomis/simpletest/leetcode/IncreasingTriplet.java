package com.shomis.simpletest.leetcode;

/**
 * 递增的三元子序列
 *
 * 给定一个未排序的数组，判断这个数组中是否存在长度为 3 的递增子序列。
 *
 * 数学表达式如下:
 *
 * 如果存在这样的 i, j, k,  且满足 0 ≤ i < j < k ≤ n-1，
 * 使得 arr[i] < arr[j] < arr[k] ，返回 true ; 否则返回 false 。
 * 说明: 要求算法的时间复杂度为 O(n)，空间复杂度为 O(1) 。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,4,5]
 * 输出: true
 * 示例 2:
 *
 * 输入: [5,4,3,2,1]
 * 输出: false
 */
public class IncreasingTriplet {

    public static void main(String[] args) {
        int a[] = {1, 3, 0, 5};
        System.out.println(increasingTriplet2(a));
    }

    public static boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= small) {
                small = n;
            } else if (n <= big) {
                big = n;
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean increasingTriplet2(int[] nums) {

        int[] a = new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= a[0]) {
                a[0] = nums[i];
            } else if (nums[i] <= a[1]) {
                a[1] = nums[i];
            } else if (nums[i] <= a[2]) {
                a[2] = nums[i];
                return true;
            }
        }

        return false;
    }

}
