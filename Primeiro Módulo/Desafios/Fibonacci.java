import java.util.List;
import java.util.ArrayList;

public class Fibonacci {

    public static int fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static List<Integer> fibonacci() {

        List<Integer> list = new ArrayList<>();
        int i = 0;
        int num = 0;
        while (num < 350) {
            num = fibo(i);
            list.add(num);
            i++;
        }
        return list;
    }

    public static Boolean isFibonacci(Integer a) {
        return fibonacci().contains(a);
    }
}