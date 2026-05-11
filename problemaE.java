import java.util.Scanner;

public class problemaE {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);

        while (true) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double theta = sc.nextDouble();

            if (a == 0 && b == 0 && theta == 0) {
                break;
            }

            double radianos = (theta * Math.PI) / 180.0;
            double area = (a * b * Math.sin(radianos)) / 2.0;

            System.out.printf("%.4f%n", area);
        }
        sc.close();
    }
}