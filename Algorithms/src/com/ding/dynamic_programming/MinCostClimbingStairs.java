package com.ding.dynamic_programming;

public class MinCostClimbingStairs {

    public static void main(String[] args) {
        int[] cost = {1, 100, 1, 1, 100, 1};

        MinCostClimbingStairs minCost = new MinCostClimbingStairs();
        System.out.println(minCost.minCCS_4(cost));
    }

    /**
     * 空间复杂度为O（1）的迭代代码
     *
     * @param cost
     * @return
     */
    public int minCCS_4(int[] cost) {
        int[] dp = new int[]{cost[0], cost[1]};
        for (int i = 2; i < cost.length; i++) {
            dp[i % 2] = Math.min(dp[0], dp[1]) + cost[i];
        }
        return Math.min(dp[0], dp[1]);
    }

    /**
     * 空间复杂度为O（n）的迭代代码
     *
     * @param cost
     * @return
     */
    public int minCCS_3(int[] cost) {
        int len = cost.length;
        int[] dp = new int[len];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < len; i++) {
            dp[i] = Math.min(dp[i - 2], dp[i - 1]) + cost[i];
        }
        return Math.min(dp[len - 2], dp[len - 1]);
    }

    /**
     * 使用缓存的递归代码
     *      自上而下的求解过程
     *
     * @param cost
     * @return
     */
    public int minCCS_2(int[] cost) {
        int len = cost.length;
        int[] dp = new int[len];
        helper_2(cost, len - 1, dp);
        return Math.min(dp[len - 2], dp[len - 1]);
    }

    private void helper_2(int[] cost, int i, int[] dp) {
        if (i < 2) {
            dp[i] = cost[i];
        } else if (dp[i] == 0) {
            helper_2(cost, i - 2, dp);
            helper_2(cost, i - 1, dp);
            dp[i] = Math.min(dp[i - 2], dp[i - 1]) + cost[i];
        }
    }

    /**
     * 递归实现
     *
     * @param cost
     * @return
     */
    public int minCCS_1(int[] cost) {
        int len = cost.length;
        return Math.min(helper_1(cost, len - 2), helper_1(cost, len - 1));
    }

    private int helper_1(int[] cost, int i) {
        if (i < 2) {
            return cost[i];
        }

        return Math.min(helper_1(cost, i - 2), helper_1(cost, i - 1)) + cost[i];
    }
}
