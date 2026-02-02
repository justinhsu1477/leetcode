package leetcode;

public class mySqrt {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int left = 2;
        int right = x / 2; // 除了1以外 不會有人的平方根 大於自己的 1/2
        int answer = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid * mid == x) {
                return mid;
            } else if (mid * mid < x) {
                answer = mid;
                left = mid + 1;
            } else if (mid * mid > x) {
                right = mid - 1;
            }
        }
        return answer;
    }
}
