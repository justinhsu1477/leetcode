package leetcode;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        return  s.length() - s.lastIndexOf("")-1;
    }

    // 從後面開始數 停在非空白的位置
    // 數到空白回傳
    public int lengthOfLastWord2(String s) {
        int length = 0;
        int i = s.length() -1; // 從尾巴開始數
        while (i >= 0 && s.charAt(i) == ' '){
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' '){
            length++;
            i--;
        }
        return length;
    }


}
