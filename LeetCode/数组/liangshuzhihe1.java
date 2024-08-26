public class liangshuzhihe1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] params = new int[]{1,2,3,4,5,6};
        int target = 7;
        int[] result = solution.twoSum(params, target);
        for(int i = 0; i < result.length; i++){
            System.out.println("result::"+result[i]);
        }
    }
}

/*
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
 * 
 * 你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
 * 
 * 你可以按任意顺序返回答案。
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 定义返回结果数组
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}