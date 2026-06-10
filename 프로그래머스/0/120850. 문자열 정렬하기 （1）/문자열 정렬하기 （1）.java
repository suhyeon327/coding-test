import java.util.ArrayList;

class Solution {
    public int[] solution(String my_string) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                answer.add(c - '0');
            }
        }
        
        return answer.stream().sorted().mapToInt(x -> x).toArray();
    }
}