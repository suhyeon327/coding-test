class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x", -1);
        int[] answer = new int[arr.length];
        int idx = 0;
        
        for (String str : arr) {
            answer[idx++] = str.length();
        }
        
        return answer;
    }
}