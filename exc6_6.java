import java.util.Scanner;

import static java.lang.Math.*;

public class exc6_6 {
    public static boolean Oblast(double x, double y) {
        if ((x >= -6 & x <= 6 & y >= 0 & y <= sqrt(36 - pow(x, 2))) & !(x >= -4 & x <= -1 & y >= 0 & y <= -1 * x - 1)
                & !(x >= -1 & x <= 4 & y >= 0 & y <= 0.75 * x + 0.75 & y <= -3 * x + 12)
                & !(x >= 1 & x <= 2 & y >= (-sqrt(-3 - pow(x, 2) + 4 * x)) + 4 & y <= (sqrt(-3 - pow(x, 2) + 4 * x)) + 4)
                & (x >= -3 & x <= 1 & y >= (-sqrt(3 - pow(x, 2) - 2 * x)) + 3 & y <= (sqrt(3 - pow(x, 2) - 2 * x)) + 3)
                & (x >= -2 & x <= 0 & y >= (-sqrt(-pow(x, 2) - 2 * x)) + 2 & y <= (sqrt(-pow(x, 2) - 2 * x)) + 2)) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        double x = 0, y = 0;
        Scanner input = new Scanner(System.in);
        boolean stop = false;
        while (!stop) {
            System.out.println("Введите \"stop\", если хотите прекратить поиск координат.");
            String in = input.nextLine();
            if (in.equals("stop")) {
                stop = true;
            } else {
                System.out.print("Введите координаты х: ");
                x = Double.parseDouble(input.nextLine());
                System.out.print("Введите координаты y: ");
                y = Double.parseDouble(input.nextLine());
                if (Oblast(x, y)) {
                    System.out.println("Точка попала в область");
                } else {
                    System.out.println("Точка не попала в область");
                }
            }
        }
    }
}