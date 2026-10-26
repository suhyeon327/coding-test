class Solution {
    public int solution(int n) {
        int answer = 0;
        
        StringBuilder rev = new StringBuilder(Integer.toString(n, 3)).reverse();
        
        for (int i = 0; i < rev.length(); i++) {
            answer = answer * 3 + (rev.charAt(i) - '0');
        }
        
        return answer;
    }
}