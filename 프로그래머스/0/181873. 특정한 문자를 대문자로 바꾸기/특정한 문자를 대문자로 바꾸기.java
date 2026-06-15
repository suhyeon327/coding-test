class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        for (char c : my_string.toCharArray()) {
            if (c == alp.charAt(0)) {
                answer += Character.toUpperCase(c);
            } else {
                answer += c;
            }
        }
        
        return answer;
    }
}