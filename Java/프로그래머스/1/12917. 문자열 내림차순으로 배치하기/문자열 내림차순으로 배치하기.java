import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] c = s.toCharArray();
        Arrays.sort(c);
        
        answer = new String(c);
        StringBuilder sb = new StringBuilder(answer);
        
        return sb.reverse().toString();
    }
}