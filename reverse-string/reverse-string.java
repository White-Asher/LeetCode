class Solution {
    public void reverseString(char[] s) {
        recur(0, s);
    }
    
    public static void recur(int index, char[] c) {
        if(index >= c.length / 2) {
            return;
        }
        char temp = c[index];
        c[index] = c[c.length-1-index];
        c[c.length-1-index] = temp;
        recur(index + 1, c);
    }
}