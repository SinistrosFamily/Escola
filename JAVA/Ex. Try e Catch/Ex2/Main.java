import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saldo disponível: ");
        double saldo = scanner.nextDouble();

        System.out.print("Valor do saque: ");
        double valorSaque = scanner.nextDouble();

        try {
            if (valorSaque <= 0) {
                throw new IllegalArgumentException("Valor inválido! O saque deve ser maior que zero.");
            }

            if (valorSaque > saldo) {
                throw new SaldoInsuficienteException(saldo, valorSaque);
            }

            double novoSaldo = saldo - valorSaque;
            System.out.printf("Saque realizado! Novo saldo: R$ %.2f%n", novoSaldo);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());

        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());

        } finally {
            System.out.println("Operação finalizada.");
        }

        scanner.close();
    }
}