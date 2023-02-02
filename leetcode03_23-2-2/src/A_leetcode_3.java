 /*
  * 滑动窗口解决
  */

 import java.util.Arrays;
 import java.util.HashSet;
 import java.util.Set;

 public class A_leetcode_3 {


     public int lengthOfLongestSubstring(String s) {

         int maxLength = 0;
         Set<Character> window = new HashSet<>();
         int left = 0;
         int right = 0;
         while (right < s.length()) {
             while (window.contains(s.charAt(right)))
                 window.remove(s.charAt(left++));

             window.add(s.charAt(right++));

             maxLength = Math.max(maxLength, right - left);
         }

         return maxLength;
     }
 }
