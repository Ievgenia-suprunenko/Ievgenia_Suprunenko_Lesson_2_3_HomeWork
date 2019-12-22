import java.util.Scanner;

public class ScannerCalculateExpression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter X: ");
        double X = in.nextDouble();
        System.out.println("Enter Y: ");
        double Y = in.nextDouble();
        System.out.println("Enter A: ");
        double A = in.nextDouble();
        System.out.println("Enter B: ");
        double B = in.nextDouble();
        System.out.println("Enter C: ");
        double C = in.nextDouble();
        double result = ((3 + (4 * X)) / 5) - ((10 * (Y - 5) * (A + B + C)) / X) + (9 * ((4 / X) + ((9 + X) / Y)));
        System.out.println("Resultat Vyrazu is: " + result);
    }
}
