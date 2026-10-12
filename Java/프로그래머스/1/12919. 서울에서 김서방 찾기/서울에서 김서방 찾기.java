class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        for (int i = 0; i < seoul.length; i++) {
            if ("Kim".equals(seoul[i])) {
                answer = String.valueOf(i);
                break;
            }
        }
        
        return "김서방은 " + answer + "에 있다";
    }
}