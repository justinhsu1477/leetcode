package leetcode;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int slow = 0; // 下一個要放的數值
        for (int fast = 0; fast< nums.length; fast++) {
            if (nums[fast] != val ) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
