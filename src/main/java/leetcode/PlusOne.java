package leetcode;

public class PlusOne {
    // 大部分情況 只要 最後一位數 ＋1 就好
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // 加一
                return digits; // 返回答案
            }
            digits[i] = 0; // 如果是9 會變成0 1進位 這一位滿了，歸零，並把進位權交給左邊那位
        }

        int[] newNumber = new int[digits.length + 1]; // new int[n] 預設值全是 0
        newNumber[0] = 1;
        return newNumber;
    }
}
