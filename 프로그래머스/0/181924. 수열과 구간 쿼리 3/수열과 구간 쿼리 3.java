class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for (int[] num : queries) {
            int k = arr[num[0]];
            arr[num[0]] = arr[num[1]];
            arr[num[1]] = k;
        }
        
        return arr;
    }
}