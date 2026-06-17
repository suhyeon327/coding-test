import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        int len = sides[0];
        int len2 = sides[1];
        int max = sides[2];
        
        if (len + len2 > max)
            answer = 1;
        else
            answer = 2;
        
        return answer;
    }
}