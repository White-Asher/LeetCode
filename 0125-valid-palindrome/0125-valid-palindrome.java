import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        String str = s.trim().toLowerCase();
        
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            // 영어 대문자 또는 소문자인지 확인
            if ( (Character.isLetter(c) && (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') ) || Character.isDigit(c)  ) {
                result.append(c);
            }
        }

        if(result.length() == 0 || result.length() == 1) {
            return true;
        }

        int max = result.length() - 1;
        for(int i = 0; i <= result.length() / 2; i++) {
            if(result.charAt(i) != result.charAt(max - i)){
                return false;
            }
        }
        return true;
    }
}