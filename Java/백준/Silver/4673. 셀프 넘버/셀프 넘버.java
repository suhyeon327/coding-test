import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            int num = i;
            int sum = i;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            list.add(sum);
        }


        for (int i = 1; i <= 10000; i++) {
            if (!list.contains(i)) {
                System.out.println(i);
            }
        }
    }
}