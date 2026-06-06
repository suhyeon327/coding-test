class Solution {
    public int solution(int n) {
        int answer = 0;
        String strnum = String.valueOf(n);
        
        for (char charnum : strnum.toCharArray()) {
            answer += charnum - '0';
        }
        
        return answer;
    }
}