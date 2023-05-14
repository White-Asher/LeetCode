import java.util.*;
import java.io.*;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int temp = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                temp++;
                max = Math.max(temp, max);
            } else {
                temp = 0;
            }
        }
        return max;
    }
}