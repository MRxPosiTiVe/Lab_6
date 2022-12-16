import java.util.Scanner;

public class exc6_2 {
    public static void main(String[] args) {
        double S, A, M, B;
//        B - расходы на жилье
//        A - стипенлия
//        M - учебники, канцтовары
//        S - накопления
        Scanner input = new Scanner(System.in);
        System.out.print("Укажите ваши накопления: ");
        S = input.nextDouble();
        System.out.print("Укажите вашу стипендию: ");
        A = input.nextDouble();
        System.out.print("Укажите расходы на жилье (Расходы > стипендия): ");
        B = input.nextDouble();
        System.out.print("Укажите расходы на канц.товары на 3 мес: ");
        M = input.nextDouble();

        double expenses, month;
        double bank = S;

        for (month = 1; month <= 20; month++) {
            S += A;
            B *= (1.0 + month / 100);
            S -= B;

            if (month % 3 == 0) {
                S += A;
                expenses = (B + M) * (1.0 + month / 100);
                S -= expenses;
            }
            if (Math.abs(S) >= 2 * bank) {
                System.out.printf("Вы проживете %5.0f месяцев и долг ваш %5.2f руб\n", month, Math.abs(S));
                break;
            }
        }
    }
}
