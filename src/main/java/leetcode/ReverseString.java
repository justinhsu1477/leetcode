package leetcode;

public class ReverseString {
    public  String reverseString(String s) {
        int left = 0;
        int right = s.length()-1;
        char[] arr = s.toCharArray();
        while (left < right) {
            char tempt  = arr[left];
            arr[left] = arr[right];
            arr[right] = tempt;
            left++;
            right--;
        }
        return  String.valueOf(arr);
    }

    public String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
}
