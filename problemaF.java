import java.util.Scanner;

public class problemaF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            long saldo = 0;
            long menorSaldo = 0; 

            for (int i = 0; i < n; i++) {
                long t = scanner.nextLong();
                saldo += t;

                if (saldo < menorSaldo) {
                    menorSaldo = saldo;
                }
            }
            long suprimentoInicial = Math.abs(menorSaldo);
            System.out.println(suprimentoInicial);
        }
        scanner.close();
    }
}