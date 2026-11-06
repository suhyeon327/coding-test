class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (char ch : s.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                answer += (char) ((ch - 'A' + n) % 26 + 'A');
            } else if (ch >= 'a' && ch <= 'z') {
                answer += (char) ((ch - 'a' + n) % 26 + 'a');
            } else {
                answer += " ";
            }
        }
        
        return answer;
    }
}