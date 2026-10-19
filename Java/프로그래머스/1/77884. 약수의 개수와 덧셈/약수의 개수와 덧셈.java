import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        for (int i = left; i <= right; i++) {
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) {
                    list.add(k);
                }
            }
            answer += list.size() % 2 == 0 ? i : -i;
            list.clear();
        }
        
        return answer;
    }
}