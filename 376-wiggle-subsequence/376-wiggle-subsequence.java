// public class Solution {
//     private int calculate(int[] nums, int index, boolean isUp) {
//         int maxcount = 0;
//         for (int i = index + 1; i < nums.length; i++) {
//             if ((isUp && nums[i] > nums[index]) || (!isUp && nums[i] < nums[index]))
//                 maxcount = Math.max(maxcount, 1 + calculate(nums, i, !isUp));
//         }
//         return maxcount;
//     }

//     public int wiggleMaxLength(int[] nums) {
//         if (nums.length < 2)
//             return nums.length;
//         return 1 + Math.max(calculate(nums, 0, true), calculate(nums, 0, false));
//     }
// }

public class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2)
            return nums.length;
        int[] up = new int[nums.length];
        int[] down = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    up[i] = Math.max(up[i],down[j] + 1);
                } else if (nums[i] < nums[j]) {
                    down[i] = Math.max(down[i],up[j] + 1);
                }
            }
        }
        return 1 + Math.max(down[nums.length - 1], up[nums.length - 1]);
    }
}