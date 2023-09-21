import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor = scanner.nextDouble();
        scanner.close();
        DecimalFormat df = new  DecimalFormat("#.00");

        if (valor > 0) {
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Saldo atual: R$ " + df.format(valor));
        } else if (valor == 0) {
            System.out.println("Encerrando o programa...");
        } else {
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        }
    }
}
