import java.util.Scanner;

public class exc6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Че надо из 3-го задания, 4-го варианта, 6 лабы, 2021?");
        System.out.println("1)EE 2)EП 3)EEП");
        int ans = input.nextInt();
        long summ = 0, summincr = 0, ssinc = 0, incr = 0, inincr = 0;
        if (ans == 1) {
            for (double i = 1; i <= 8; i++) {
                for (double j = 1; j <= i; j++) {
                    summ += (long) Math.pow(j, 2);
                }
            }
            System.out.println("На тебе на 1-е: --> " + summ);
        }
        if (ans == 2) {
            for (double i = 1; i <= 8; i++) {
                incr = 1;
                for (double j = 1; j <= 3; j++) {
                    incr *= (long) (j + i);
                }
                summincr += incr;
            }
            System.out.println("На тебе на 2-е: --> " + summincr);
        }
        if (ans == 3) {
            for (double i = 1; i <= 8; i++) {
                inincr = 0;
                for (double j = 1; j <= i; j++) {
                    incr = 1;
                    for (double k = 1; k <= 2 * (i + j); k++) {
                        incr *= (long) ((2 * j) - (3 * (i - k)));
                    }
                    inincr += incr;
                }
                ssinc += inincr;
            }
            System.out.println("На тебе на 3-е: --> " + ssinc);
        }
    }
}
