import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int[] query : queries) {
            int min = Integer.MAX_VALUE;
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            for (int i = s; i <= e; i++) {
                if (arr[i] > k) {
                    min = Math.min(arr[i], min);
                }
            }
            
            if (min == Integer.MAX_VALUE) {
                answer.add(-1);
            } else {
                answer.add(min);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}