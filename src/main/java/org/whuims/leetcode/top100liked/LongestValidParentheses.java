package org.whuims.leetcode.top100liked;

public class LongestValidParentheses {

    public int longestValidParentheses(String s) {
        int len = s.length();
        int[] dp = new int[len];
        int max = 0;
        for (int i = 1; i < len; i++) {
            char c = s.charAt(i);
            if (c == ')') {
                if (i >= 1 && s.charAt(i - 1) == '(') {
                    dp[i] = i >= 2 ? dp[i - 2] + 2 : 2;
                    max = Math.max(max, dp[i]);
                } else {
                    if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                        dp[i] = dp[i - 1] + 2 + (i - dp[i - 1] - 2 >= 0 ? dp[i - dp[i - 1] - 2] : 0);
                        max = Math.max(max, dp[i]);
                    }
                }
            }
        }
        return max;
    }
}
