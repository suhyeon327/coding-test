class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);
        
        char str1 = my_string.charAt(num1);
        char str2 = my_string.charAt(num2);
        
        sb.setCharAt(num1, str2);
        sb.setCharAt(num2, str1);
        
        return sb.toString();
    }
}