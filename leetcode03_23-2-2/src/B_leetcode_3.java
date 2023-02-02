import java.util.Arrays;

public class B_leetcode_3 {
    public static void main(String[] args) {
        String str = "abcabcde";
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        int[] dict = new int[128];

        //把数组的所有元素都初始化为-1
        Arrays.fill(dict, -1);
        int maxLength = 0;
        int left = 0;
        int right = 0;
        for (; right < s.length(); right++) {
            left = Math.max(left, dict[s.charAt(right)] + 1);
            dict[s.charAt(right)] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }



        return maxLength;
    }
}
