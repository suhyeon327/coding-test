class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (char ch : my_string.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                continue;
            } else {
                answer += ch;
            }
        }
        
        return answer;
    }
}