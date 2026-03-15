import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
 
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }


        int resLen = nums.length / 2;

        if (set.size() >= resLen) {
            return resLen;
        } else {

            return set.size();
        }
    }
}