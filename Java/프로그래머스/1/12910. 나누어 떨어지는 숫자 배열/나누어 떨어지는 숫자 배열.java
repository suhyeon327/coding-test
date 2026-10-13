import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        
        for (int element : arr) {
            if (element % divisor == 0) {
                answer.add(element);
            }
        }
        
        if (answer.size() == 0)
            answer.add(-1);
        
        return answer.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}