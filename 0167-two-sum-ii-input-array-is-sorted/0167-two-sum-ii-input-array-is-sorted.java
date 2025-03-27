class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int ii = numbers.length - 1;
        while(i < ii) {
            int l = numbers[i];
            int r = numbers[ii];
            if(l + r > target) {
                ii--;
            } else if (l + r < target) {
                i++;
            } else {
                break;
            }
        }

        return new int[]{i+1, ii+1};
    }
}