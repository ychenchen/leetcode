package com.ychenchen._0067;

/**
 * @author Alexis.Yang
 * @descriptioin
 * @date 2019-07-05 15:52
 * @copyright www.ychenchen.com
 */
public class TestCase {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String sum1 = solution.addBinary("11", "1");
        System.out.println(sum1);

        String sum2 = solution.addBinary("1010", "1011");
        System.out.println(sum2);
    }
}
