package HomeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskA_Fib {
    static int fib(int n) {
        if (n <= 2) {
            return 1;
        } else {
            int fib1 = 1;
            int fib2 = 1;
            int sum;
            for (int i = 0; i < n-2; i++) {
                 sum = fib1 + fib2;
                 fib1 = fib2;
                 fib2 = sum;
            }
            return fib2;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        System.out.println(fib(n));
    }
}
