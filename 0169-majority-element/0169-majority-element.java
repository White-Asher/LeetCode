import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        int max = 0;
        int value = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int tar = nums[i];
            map.put(tar, map.getOrDefault(tar, 0) + 1);
            if(map.get(tar) >= max) {
                max = map.get(tar);
                value = tar;
            }
        }

        return value;
    }
}