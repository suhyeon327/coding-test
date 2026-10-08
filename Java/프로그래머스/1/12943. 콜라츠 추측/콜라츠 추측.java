class Solution {
    public long solution(int num) {
        long n = num;
        int repeat = 0;
        
        if (n == 1) {
            return 0;
        }
        
        while (repeat < 500) {
            n = (n % 2 == 0) ? n /= 2 : n * 3 + 1;    
            repeat++;
            
            if (n == 1)
                return repeat;
        }
        
        return -1;
    }
}