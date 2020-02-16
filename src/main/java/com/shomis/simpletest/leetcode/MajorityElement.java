package com.shomis.simpletest.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 多数元素
 *
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 示例 1:
 *
 * 输入: [3,2,3]
 * 输出: 3
 *
 * 示例 2:
 *
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] a = new int[] {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement2(a));

    }

    public static int majorityElement(int[] nums) {
        int length = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer integer = map.compute(num, (k, v) -> {
                if (v == null) { return 1; }
                return v + 1;
            });

            if (integer + 1 > Math.ceil((double)length / 2)) {
                return num;
            }
        }
        return -1;

    }

    public static int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
