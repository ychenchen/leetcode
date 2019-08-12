package com.ychenchen._0027;

/**
 * @author Alexis.Yang
 * @descriptioin
 * @date 2019-08-12 19:59
 * @copyright www.embracesource.com
 */
public class TestCase {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] nums = new int[] {0,1,2,2,3,0,4,2};
        int[] nums = new int[] {3,2,2,3};
        int i = solution.removeElement(nums, 2);
        System.out.println(i);
    }
}
