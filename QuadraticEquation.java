import java.text.NumberFormat;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);

        System.out.println("Enter the value of a: ");
        int a = scn.nextInt();
        System.out.println("Enter the value of b: ");
        int b = scn.nextInt();
        System.out.println("Enter the value of c: ");
        int c = scn.nextInt();

        double numerator1 = -b + Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double numerator2 = -b - Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double denominator = 2 * a;

        double x1 = numerator1 / denominator;
        double x2 = numerator2 / denominator;

        if (Double.isNaN(x1) || Double.isNaN(x2)) {
            System.out.println("The equation has no real roots.");
        } else if (x1 == x2) {
            System.out.println("x = " + nf.format(x1));
        } else {
            System.out.println("x1 = " + nf.format(x1) + ", x2 = " + nf.format(x2));
        }

        scn.close();
    }
}
