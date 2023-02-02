import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class C_leetcode_3 {
   public int lengthOfLongestSubstring(String s){
       int maxLength=0;
       Queue<Character> queue = new LinkedList<>();
       for (int i = 0; i < s.length(); i++) {
           while (queue.contains(s.charAt(i)))queue.poll();

           queue.offer(s.charAt(i));
           maxLength=Math.max(maxLength, queue.size());

       }
       return maxLength;
   }
}
