import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i : nums) {
            list.add(i);
        }
        
        int left = k % nums.length;
        if(left == 0) return;

        int last = left;

        // 개수만큼 맨 뒤에서 시작
        for(int i = 0; i < nums.length; i++) {
            if (left == 0) {
                for(int ii = 0; ii < nums.length - last; ii++) {
                    nums[i++] = list.get(ii);
                }
                return;
            } else {
                nums[i] = list.get(nums.length - left);
                left--;
            }
        }

        return;
    }
}