import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int i = 1;

        while (i < n) {
            int sum = i;
            int num = i;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            
            if (n == sum) {
                System.out.println(i);
                return;
            }

            i++;
        }
    
        System.out.println(0);
    }
}