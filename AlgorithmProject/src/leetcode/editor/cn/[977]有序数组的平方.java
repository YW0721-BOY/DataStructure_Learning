package leetcode.editor.cn;//给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
//
// 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-4,-1,0,3,10]
//输出：[0,1,9,16,100]
//解释：平方后，数组变为 [16,1,0,9,100]
//排序后，数组变为 [0,1,9,16,100] 
//
// 示例 2： 
//
// 
//输入：nums = [-7,-3,2,3,11]
//输出：[4,9,9,49,121]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁴ 
// -10⁴ <= nums[i] <= 10⁴ 
// nums 已按 非递减顺序 排序 
// 
//
// 
//
// 进阶： 
//
// 
// 请你设计时间复杂度为 O(n) 的算法解决本问题 
// 
//
// Related Topics 数组 双指针 排序 👍 740 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution_1 {
    public int[] sortedSquares(int[] nums) {
        int[] result=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        for (int k = nums.length; k > 0;) {
            if (nums[i]*nums[i]<nums[j]*nums[j]){
                result[--k]=nums[j]*nums[j];
                j--;
            }else {
                result[--k]=nums[i]*nums[i];
                i++;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
