package org.whuims.leetcode.topinterview;

public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        return n == 0 ? false : n == Math.pow(3, Math.round(Math.log(n) / Math.log(3)));
    }
}