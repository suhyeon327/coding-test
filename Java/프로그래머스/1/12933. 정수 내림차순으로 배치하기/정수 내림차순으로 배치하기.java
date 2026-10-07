import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        List<Long> list = new ArrayList<>();
        
        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        long result = 0;
        
        for (long num : list) {
            result = result * 10 + num;
        }
        
        return result;
    }
}