import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length <= 0) {
            return 0;
        }
        int cnt = 1;
        int idx = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) {
                cnt++;
            } else {
                cnt = 1;
            }
            if(cnt <= 2) {
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }
}