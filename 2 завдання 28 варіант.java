import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
1
        System.out.print("Введіть значення a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть значення b: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();

        double f;
        if (x < 4) {
            f = Math.abs(a * x + Math.pow(x, 2));
        } else if (x == 4) {
            f = Math.sqrt(b * x - 1) + 3;
        } else if (x > 4 && x <= 10) {
            f = 1 / Math.cos(x);
        } else {
            System.out.println("Значення x поза допустимим діапазоном.");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}