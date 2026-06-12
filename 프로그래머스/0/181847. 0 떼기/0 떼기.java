class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        for (char ch : n_str.toCharArray()) {
            if (ch == '0' && answer == "") {
                continue;
            }
            answer += ch;
            
        }
        
        return answer;
    }
}