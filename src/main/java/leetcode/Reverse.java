package leetcode;

public class Reverse {
    /*
    % 10 能拿到尾數。
    x / 10 能縮短數字。
     */
    public int reverse(int x){
        int answer = 0;
        if (x<0){
            throw new IllegalArgumentException("不能小於0");
        }
        while (x != 0) {
            answer = answer*10 + (x%10);
            x /= 10;
        }
        return answer;
    }
}
