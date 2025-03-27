import java.util.*;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++) {
            char tar = magazine.charAt(i);
            map.put(tar, map.getOrDefault(tar , 0) + 1);
        }

        for(int i = 0; i < ransomNote.length(); i++) {
            char tar = ransomNote.charAt(i);
            map2.put(tar, map2.getOrDefault(tar , 0) + 1);
        }

        for(Character key :map2.keySet()) {
            Integer value = map2.get(key);
            Integer target = map.getOrDefault(key, 0);
            if(value > target) {
                return false;
            }
        }
        return true;


    }
}