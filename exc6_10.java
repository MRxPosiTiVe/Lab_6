import static java.lang.Math.*;

public class exc6_10 {
    public static void main(String[] args) {
        double sum;
        double h;
        for (double n = 10; n <= 10000; n *= 10) {
            h = 1 / n;
            sum = 0;
            for (int i = 0; i < n; i++) {
                sum += (cos(n - h * i) - sin(pow(n - h * i, 2))) * h;
            }
            System.out.println(n + "\n" + h + "\n" + sum + "\n5.18\n" + abs(sum - 5.18) + "\n");
        }

    }
}
