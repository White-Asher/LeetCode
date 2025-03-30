import java.util.*;

class Solution {
    public int candy(int[] ratings) {
        int[] nums = new int[ratings.length];
        Arrays.fill(nums, 1);
        int ans = 0;

        for(int i = 1; i < ratings.length; i++) {
            System.out.println("[i] : " + i);
            if(ratings[i] > ratings[i - 1]) {
                nums[i] = nums[i - 1] + 1;
                System.out.println("nums[i] : " + nums[i]);
                System.out.println("nums[i - 1] : " + nums[i - 1]);
                System.out.println("ratings[i] : " + ratings[i]);
                System.out.println("ratings[i - 1] : " + ratings[i - 1]);
            } 
        }

        for(int i = ratings.length - 2; i >= 0; i--) {
            if(ratings[i] > ratings[i + 1]) {
                if(nums[i] >= nums[i + 1] + 1) {
                    continue;
                } else {
                    nums[i] = nums[i + 1] + 1;
                }
                
            }
        }
 
        for(int i : nums) {
            ans+=i;
        }

        return ans;
        
    }
}