import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        Arrays.sort(strings, Comparator.comparing((String str) -> str.charAt(n))
               .thenComparing(str -> str));
        
        return strings;
    }
}