class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean flag = true;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == numbers[j]) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
            
            if (!flag) {
                answer += i;
            }
        }
        
        return answer;
    }
}