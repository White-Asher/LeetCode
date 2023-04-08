class Solution {
    public int romanToInt(String s) {
        int answer = 0;

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("I",1);
        hashMap.put("V",5);
        hashMap.put("X",10);
        hashMap.put("L",50);
        hashMap.put("C",100);
        hashMap.put("D",500);
        hashMap.put("M",1000);
        
        s=s.replace("IV","IIII");
        s=s.replace("IX","VIIII");
        s=s.replace("XL","XXXX");
        s=s.replace("XC","LXXXX");
        s=s.replace("CD","CCCC");
        s=s.replace("CM","DCCCC");

        for(int i = 0; i < s.length(); i++) {
            for(String key : hashMap.keySet()){
                if(s.charAt(i) == key.charAt(0)) {
                    answer += hashMap.get(key);
                }
            }
        }

        return answer;
    }
}
