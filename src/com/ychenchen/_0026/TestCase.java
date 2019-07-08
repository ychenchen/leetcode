package com.ychenchen._0026;

import com.ychenchen._0026.Solution;

/**
 * @author Alexis.Yang
 * @descriptioin
 * @date 2019-07-08 08:31
 * @copyright www.ychenchen.com
 */
public class TestCase {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4,4,5,5,5};

        int sum2 = solution.removeDuplicates(nums);
        System.out.println(sum2);
    }
}
