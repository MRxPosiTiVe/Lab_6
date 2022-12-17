import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class exc6_6 {
    public static boolean Oblast(double x, double y) {
        int counter = 0;
        if (x >= -6 & x <= 6 & y >= 0 & y <= sqrt(36 - pow(x, 2))) {
            counter++;
            if (x >= -4 & x <= -1 & y >= 0 & y <= -1 * x - 1) {
                counter--;
            }
            if (x >= -1 & x <= 4 & y >= 0 & y <= 0.75 * x + 0.75 & y <= -3 * x + 12) {
                counter--;
            }
            if (x >= 1 & x <= 2 & y >= (-sqrt(-3 - pow(x, 2) + 4 * x)) + 4 & y <= (sqrt(-3 - pow(x, 2) + 4 * x)) + 4) {
                counter--;
            }
        } else {
            return false;
        }
        if (x >= -3 & x <= 1 & y >= (-sqrt(3 - pow(x, 2) - 2 * x)) + 3 & y <= (sqrt(3 - pow(x, 2) - 2 * x)) + 3) {
            counter = 0;
            if (x >= -2 & x <= 0 & y >= (-sqrt(-pow(x, 2) - 2 * x)) + 2 & y <= (sqrt(-pow(x, 2) - 2 * x)) + 2) {
                counter++;
            }
        }
        return counter > 0;
    }

    public static void main(String[] args) {
        double x = 0, y = 0;
        Scanner input = new Scanner(System.in);
        boolean stop = false;
        while (!stop) {
            System.out.println("Введите \"stop\" если хотите закончить.");
            String in = input.nextLine().toLowerCase(Locale.ROOT);
            if (in.equals("stop")) {
                stop = true;
            } else {
                System.out.println("Укажите x: ");
                x = Double.parseDouble(input.nextLine());
                System.out.println("Укажите y: ");
                y = Double.parseDouble(input.nextLine());
                if (Oblast(x, y)) {
                    System.out.println("Точка попала в область :)");
                } else {
                    System.out.println("Точка НЕ попала в область");
                }
            }
        }
    }
}
