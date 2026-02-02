package leetcode;

public class climbStairs {
    public int climb(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int first = 1; // 第一階算法
        int second = 2; // 第二階算法
        int answer = 0;
        for (int i = 3; i <= n; i++){
            answer = first + second; // 這層的答案是 first+second
            first = second; // 往前走
            second = answer; // 也往前走
        }
        return  answer;
    }
}
