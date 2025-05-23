import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int idx = 0;
        if(nums.length <= 0) {
            return 0;
        }

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[idx]) {
                idx++;
                nums[idx] = nums[i];
            } 
        }

        return idx+1;
    }
}