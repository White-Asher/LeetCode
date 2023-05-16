class Solution {
    public boolean isPalindrome(int x) {
        if(x <= -1) return false;
        else {
            String a = String.valueOf(x);
            for(int i = 0; i < a.length() / 2; i++) {
                if(a.charAt(i) != a.charAt(a.length()-1-i)){
                    return false;
                } 
            }
            return true;
        }
    }
}