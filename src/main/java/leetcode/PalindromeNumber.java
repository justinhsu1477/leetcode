package leetcode;

public class PalindromeNumber {
    // 檢查是否是回文數字
    public boolean isPalindromeNumber(int x){
        int originalX = x;
        int reverseX = 0;
        if (x<0){
            return false;
        }
        while (x != 0) {
            int pop = x % 10;
            if (reverseX > Integer.MAX_VALUE/10){
                return false;
            }
            if (reverseX < Integer.MIN_VALUE/10){
                return false;
            }
            reverseX = reverseX*10 + pop;
            x /= 10;
        }
        return originalX == reverseX;
    }
}
