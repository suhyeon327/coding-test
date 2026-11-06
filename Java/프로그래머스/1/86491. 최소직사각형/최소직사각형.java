class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max1 = 0;
        int max2 = 0;
        
        for (int[] arr : sizes) {
            if (arr[0] < arr[1]) {
                int temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            }
            
            if (arr[0] > max1) {
                max1 = arr[0];
            }
            
            
            if (arr[1] > max2) {
                max2 = arr[1];
            }
            
            answer = max1 * max2;
        }
        
        return answer;
    }
}