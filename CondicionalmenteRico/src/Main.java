import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        int saldoTotal = scanner.nextInt();
        int valorSaque = scanner.nextInt();
        scanner.close();

        //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
        if (valorSaque < saldoTotal) {
            saldoTotal = saldoTotal - valorSaque;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldoTotal);
        } else
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }
}