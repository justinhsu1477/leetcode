package leetcode;

import java.util.HashMap;
import java.util.Map;

// LeetCode #1 - Two Sum
// https://leetcode.com/problems/two-sum/
public class Solution_0001_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length<2){
            throw new IllegalArgumentException("數列小於2");
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Solution_0001_TwoSum sol = new Solution_0001_TwoSum();
        int[] result = sol.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("[" + result[0] + ", " + result[1] + "]"); // [0, 1]
    }
}
