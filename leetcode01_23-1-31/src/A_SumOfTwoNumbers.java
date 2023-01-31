public class A_SumOfTwoNumbers {
    /*
     * 解法A：时间复杂度为O(n^2)
     * 通过for循环的嵌套进行计算
     */
    public static void main(String[] args) {
        int[] nums={2, 7, 11, 15};

        int[] ints = twoSum(nums, 9);

        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result =new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;

                    return result;
                }
            }
        }
        return null ;
    }
}
