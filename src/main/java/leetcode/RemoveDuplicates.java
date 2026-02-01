package leetcode;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int slow = 0; // 最後一個 不重複的值
        for (int fast = 1; fast < nums.length; fast++){
            if (nums[fast]!= nums[slow]){
                slow++;
                nums[slow] = nums[fast]; // 把新元素搬過來
            }
        }
        return slow+1; // 從0開始所以要加一
    }

}
