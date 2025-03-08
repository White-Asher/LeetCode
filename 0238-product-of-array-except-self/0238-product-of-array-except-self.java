import java.util.*;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] multi = new int[nums.length];
        multi[0] = 1;
        // target :: LEFT
        for(int i = 1; i < nums.length; i++) {
            multi[i] = nums[i-1] * multi[i-1];
        }

        // traget ":: right
        int rightMulti = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            multi[i] *= rightMulti;
            rightMulti *= nums[i];
        }

        return multi;
    }
}