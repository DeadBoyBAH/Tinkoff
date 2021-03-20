package HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_G_koren {
    static public Boolean f(double x, double C) {
        return (x*x + Math.sqrt(x) - C >= 0);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double C = Double.parseDouble(reader.readLine());

        double l = 0;
        double r = 100000;

        for (int i = 0; i < 100; i++) {
            double m = (l + r)/2;
            if (f(m, C)) r = m;
            else l = m;
        }

        System.out.println(r);
    }
}
