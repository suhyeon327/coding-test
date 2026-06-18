import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        int[] arr1 = Arrays.copyOf(num_list, n);
        int[] arr2 = Arrays.copyOfRange(num_list, n, num_list.length);
        
        return IntStream.concat(Arrays.stream(arr2),
                                Arrays.stream(arr1))
                     .toArray();
    }
}