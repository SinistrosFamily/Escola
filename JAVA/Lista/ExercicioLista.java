package Lista;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioLista {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Adicionar nota");
            System.out.println("2. Remover nota");
            System.out.println("3. Listar notas");
            System.out.println("4. Calcular média");
            System.out.println("5. Ordenar notas");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a nota: ");
                    double nota = sc.nextDouble();
                    notas.add(nota);
                    System.out.println("Nota adicionada!");
                    break;

                case 2:
                    if (notas.isEmpty()) {
                        System.out.println("Nenhuma nota cadastrada!");
                        break;
                    }
                    for (int i = 0; i < notas.size(); i++) {
                        System.out.println("[" + i + "] " + notas.get(i));
                    }
                    System.out.print("Posição para remover: ");
                    int pos = sc.nextInt();
                    if (pos >= 0 && pos < notas.size()) {
                        notas.remove(pos);
                        System.out.println("Nota removida!");
                    } else {
                        System.out.println("Posição inválida!");
                    }
                    break;

                case 3:
                    if (notas.isEmpty()) {
                        System.out.println("Nenhuma nota cadastrada!");
                        break;
                    }
                    System.out.println("===== Notas =====");
                    for (int i = 0; i < notas.size(); i++) {
                        System.out.println("[" + i + "] " + notas.get(i));
                    }
                    break;

                case 4:
                    if (notas.isEmpty()) {
                        System.out.println("Nenhuma nota cadastrada!");
                        break;
                    }
                    double soma = 0;
                    for (double n : notas) soma += n;
                    System.out.println("Média: " + (soma / notas.size()));
                    break;

                case 5:
                    Collections.sort(notas);
                    System.out.println("Notas ordenadas: " + notas);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}