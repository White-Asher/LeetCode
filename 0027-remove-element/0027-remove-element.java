import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        int s = 0;
        int e = nums.length - 1;
        int ans = 0;

        for(int i = 0; i < nums.length; i++) {
            // 조건
            if(i > e) {
                break;
            }

            if(nums[i] == val) {
                // e가 유효한 인덱스인지 확인
                if(e < 0) {
                    break;
                }
                
                // e가 가리키는 값이 val인 동안 e를 감소
                while(e >= 0 && nums[e] == val) {
                    e--;
                    ans++;
                }
                
                // e가 유효한 인덱스인지 다시 확인
                if(e < 0 || e < i) {
                    break;
                }

                nums[i] = nums[e--];
                ans++;
            }
        }

        return nums.length - ans;
    }
}