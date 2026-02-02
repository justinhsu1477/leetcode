package leetcode;

public class AddBinary {

    public String addBinary(String a, String b) {
        int aa = a.length()-1;
        int bb = b.length()-1;
        int carry = 0; // 進位用
        StringBuilder sb = new StringBuilder();
        while (aa >= 0 || bb >= 0 || carry >0) {
            int sum = carry; // 上一輪留下的
            if (aa >=0){
                sum += a.charAt(aa) - '0'; // 字元轉成數值
                aa--;
            }
            if (bb >=0){
                sum += b.charAt(bb) - '0'; // 字元轉成數值
                bb--;
            }
            sb.append(sum % 2); // % 餘數當作當前值
            carry = sum / 2; // 進位
        }
        return sb.reverse().toString();
    }
}
