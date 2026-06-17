import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[IntStream.of(arr).sum()];
        int idx = 0;
        
        for (int i : arr) {
            for (int j = 0; j < i; j++) {
                answer[idx++] = i;
            }
        }
        
        return answer;
    }
}