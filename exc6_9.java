import java.util.*;

import static java.lang.Math.*;

public class exc6_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = input.nextDouble();
        System.out.print("Введите p: ");
        double p = input.nextDouble();
        double y = log(x * (p + 1)) / p;
        int counter = 0;
        for (double e = pow(10, - 1); e > pow(10, - 6); e *= 0.1) {
            while (true) {
                double ly = y;
                y = 1 / p * ((p - 1) * y + x / pow(y, (p - 1)));
                counter++;
                if (abs(y - ly) < e) {
                    System.out.printf("Точность: %e\nКорень: %f\nЧисло итераций: %d\n\n", e, y, counter);
                    break;
                }
            }
        }
    }
}
