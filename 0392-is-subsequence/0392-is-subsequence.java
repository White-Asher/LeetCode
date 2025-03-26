import java.util.*;

class Solution {
    public boolean isSubsequence(String s, String t) {
        int si = 0;
        if(s.length() == 0) {
            return true;
        }
        for (int i = 0; i < t.length(); i++) {
            if(si >= s.length()){
                return false;
            }
            char cur = s.charAt(si);
            if(cur == t.charAt(i)) {
                si++;
            } 
        }
        if(si != s.length()) {
            return false;
        }
        return true;
    }
}
