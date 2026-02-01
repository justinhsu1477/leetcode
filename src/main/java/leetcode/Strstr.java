package leetcode;

public class Strstr {
    public int strStr(String haystack, String needle) {
       int hlength = haystack.length();
       int nlength = needle.length();
       if (nlength == 0){
           return 0;
       }
       for(int i = 0; i <= hlength - nlength; i++){
           // 檢查從 i 開始的子字串是否等於 needle
           if (haystack.substring(i,i+nlength).equals(needle)){
               return i;
           }
       }
       return -1;
    }
}
