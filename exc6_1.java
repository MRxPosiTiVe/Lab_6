import java.util.Scanner;

import static java.lang.Math.*;

public class exc6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0, scrm = 0, cr, num = 0, den = 1;
        System.out.print("Введите N: ");
        int N = input.nextInt();
        System.out.print("Введите M: ");
        int M = input.nextInt();
        for (int i = 1; i <= N; i++) {
            num += cos(i);
            if (i % 2 != 0) {
                den *= sin(i);
            } else {
                den *= cos(i);
            }
            cr = num / den;
            sum += cr;
            if (cr < M) {
                scrm += cr;
            }
        }
        System.out.printf("Сумма первых %d членов ряда %5.3f\n", N, sum);
        System.out.printf("Сумма членов ряда, которые меньше %d = %5.3f\n", M, scrm);
    }
}
