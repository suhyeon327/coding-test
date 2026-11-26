import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] bucket = new int[n];
        for (int i = 0; i < n; i++) {
            bucket[i] = i + 1;
        }

        for (int a = 0; a < m; a++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            for (int b = i; b < j; b++, j--) {
                int temp = bucket[b - 1];
                bucket[b - 1] = bucket[j - 1];
                bucket[j - 1] = temp;
            }
        }

        for (int i = 0; i < bucket.length; i++) {
            System.out.print(bucket[i] + " ");
        }
    }
}