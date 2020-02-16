package com.shomis.simpletest.leetcode;

/**
 * 搜索二维矩阵 II
 *
 *
 * 编写一个高效的算法来搜索 m * n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：
 *
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 * 示例:
 *
 * 现有矩阵 matrix 如下：
 *
 * [
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 * ]
 * 给定 target = 5，返回 true。
 *
 * 给定 target = 20，返回 false。
 */
public class SearchA2DMatrix {

    public static void main(String[] args) {
        //int[][] a = new int[][] {
        //    {1, 4, 7, 11, 15},
        //    {2, 5, 8, 12, 19},
        //    {3, 6, 9, 16, 22},
        //    {10, 13, 14, 17, 24},
        //    {18, 21, 23, 26, 30}
        //};
        int[][] a = new int[][] {
            {}
        };

        System.err.println(searchMatrix2(a, 20));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            if (matrix[i][n - 1] < target || matrix[i][0] > target) {
                continue;
            }
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean searchMatrix2(int[][] matrix, int target) {
        return false;
    }
}
