import java.util.HashMap;

public class B_SumOfTwoNumbers {
    /*
     * 解法B：时间复杂度为O(n)
     * 通过HashMap
     *
     * HashMap的方法：
     * get
     * put
     * ContainsKey
     *
     * get()-->Value
     * getKey()-->Key
     *
     * Hash
     */
    public static void main(String[] args) {
        int[] nums={0, 0};

        int[] ints = twoSum(nums, 0);

        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target-nums[i])){
                return new int[]{hashMap.get(target-nums[i]),i};
            }
            hashMap.put(nums[i],i);
        }
        return new int[0];
    }
}
