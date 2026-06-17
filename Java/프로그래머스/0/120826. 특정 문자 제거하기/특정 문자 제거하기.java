class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        for (char ch : my_string.toCharArray()) {
            if (ch == letter.charAt(0))
                continue;
            answer += ch;
        }
        
        return answer;
    }
}