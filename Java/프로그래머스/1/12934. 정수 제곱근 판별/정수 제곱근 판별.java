class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);
        
        return (sqrt % 1 == 0) ? ((long) sqrt + 1)  * ((long) sqrt + 1) : -1;
    }
}