package leetcode;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length ==2){ //長度是2 就只有兩種情形
            return Math.min(cost[0],cost[1]);
        }
        int pre2 = cost[0];// 前兩步的成本
        int pre1 = cost[1];// 前一步的成本
        int answer = 0;
        for (int i = 2; i < cost.length; i++) { // 第三階 開始
            answer = cost[i]+ Math.min(pre1,pre2);
            pre2 = pre1;
            pre1 = answer;
        }
        return Math.min(pre1,pre2); //「跨過」最後一階，所以是比較最後兩個累積花費
    }

    // 代表的是「到達該階梯前」的花費
    public int min(int[] cost){
        int pre2 = 0; // 代表到達 index 0 之前的花費（起點前）
        int pre1 = 0; // 代表到達 index 1 之前的花費（起點前）
        for (int c : cost) {
            int curr = c + Math.min(pre1, pre2);
            pre2 = pre1;
            pre1 = curr;
        }
        return  Math.min(pre1,pre2);
    }

}
