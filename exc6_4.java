import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.Locale;

public class exc6_4 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US); // Instead of "," writing "."
        System.out.println("Хотите переводить числа? (true || false)");
        boolean ans = input.nextBoolean();

        while (ans) {
            ArrayList<Integer> nums = new ArrayList<>();
            System.out.print("Введите число в 10-ой СС: ");
            double num = input.nextDouble();
            System.out.print("Введите систему счисления: ");
            double ns = input.nextInt();
            double mean;
            int qwe;

            if (ns == 0 || ns == 1 || ns > 10) {
                throw new Exception("Не верная система счисления!");
            } else {
                if (num / 10 >= 0.1) {
                    throw new Exception("Во введенем числе присутствует целая часть!");
                } else {

                    mean = num * ns;
                    qwe = (int) Math.floor(mean);
                    nums.add(qwe);
                    for (int i = 1; i <= 15; i++) {
                        mean = (mean - qwe) * ns;
                        qwe = (int) Math.floor(mean);
                        nums.add(qwe);
                    }
                }
            }
            StringJoiner joiner = new StringJoiner("");
            for (Integer integer : nums) {
                joiner.add(integer.toString());
            }
            String answer = joiner.toString();
            System.out.printf("Значение %1.5f в СС с основание %-5.0f равно --> 0.%s\n", num, ns, answer);
            System.out.println("Хотите переводить дальше?");
            ans = input.nextBoolean();
        }
        System.out.println("Ладно");
    }
}
