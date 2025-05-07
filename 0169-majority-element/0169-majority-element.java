// Follow-up solution
class Solution {
    public int majorityElement(int[] nums) {
        // 후보자(candidate)를 저장할 변수
        // 초기값은 어떤 값이든 상관 없음. 어차피 count가 0일 때 배열의 첫 요소로 설정
        int candidate = 0; 
        
        // 현재 후보자의 등장 횟수(실제 횟수가 아닌, 상대적인 지지표)를 저장할 변수
        int count = 0;

        // 배열의 모든 요소를 순회
        for (int num : nums) {
            // 만약 count가 0이라면, 현재 요소를 새로운 후보자로 지정
            if (count == 0) {
                candidate = num;
                count = 1; // 새로운 후보자이므로 카운트는 1로 시작
            } 
            // 현재 요소가 현재 후보자와 같다면, 카운트를 증가함.
            else if (num == candidate) {
                count++;
            } 
            // 현재 요소가 현재 후보자와 다르다면, 카운트를 감소함.
            else {
                count--;
            }
        }

        // 문제의 가정에 따라 과반수 요소는 항상 존재하므로,
        // 이 루프가 끝난 후 'candidate' 변수에 남아 있는 값이 과반수 값임.
        return candidate;
    }
}

/*
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

*/