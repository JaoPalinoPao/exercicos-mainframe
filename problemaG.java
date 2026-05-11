import java.util.Scanner;

public class problemaG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int ds = scanner.nextInt();
            int ys = scanner.nextInt();
            int dm = scanner.nextInt();
            int ym = scanner.nextInt();

            for (int t = 1; t <= 5000; t++) {
                boolean guarda1NoPosto = (t + ds) % ys == 0;
                boolean guarda2NoPosto = (t + dm) % ym == 0;

                if (guarda1NoPosto && guarda2NoPosto) {
                    System.out.println(t);
                    break;
                }
            }
        }  
        scanner.close();
    }
}