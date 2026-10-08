import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        try {
            if (idade > 120) {
                throw new IdadeInvalidaException();
            }
            System.out.println("Idade válida!");

        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
