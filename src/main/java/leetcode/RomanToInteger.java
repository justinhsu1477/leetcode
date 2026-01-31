package leetcode;

import javax.print.DocFlavor;
import java.rmi.MarshalledObject;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int n = s.length();

        for (int i=0; i < n ; i++){
            int value = map.get(s.charAt(i));

            if (i < n-1 && value < map.get(s.charAt(i+1))){
                result -= value;
            }
            else{
                result += value;
            }
        }
        return result;
    }

    public int roman2(String s) {
        int result = 0;
        int prevValue = 0;

        // 從字串最後一個字元開始往回走
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = getValue(s.charAt(i));

            // 如果當前數字比右邊的小（例如 IV 中的 I 比 V 小）
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                // 否則一律相加，並更新「右側最大值」
                result += currentValue;
                prevValue = currentValue;
            }
        }
        return result;
    }

    private int getValue(char c){
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
