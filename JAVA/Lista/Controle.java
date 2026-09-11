package Lista;
import java.util.ArrayList;
import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Inserção de alunos
        while (true) {
            System.out.print("\nNome do aluno (ou 'fim' para encerrar): ");
            String nome = sc.next();

            if (nome.equals("fim")) break;

            System.out.print("Nota parcial 1 (0-100): ");
            int nota1 = sc.nextInt();

            System.out.print("Nota parcial 2 (0-100): ");
            int nota2 = sc.nextInt();

            alunos.add(new Aluno(nome, nota1, nota2));
        }

        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado!");
            return;
        }

        // Cálculo da média da turma
        double somaMedias = 0;
        int aprovados = 0, finais = 0, reprovados = 0;

        for (Aluno a : alunos) {
            somaMedias += a.getMedia();

            if (a.getMedia() >= 70)       aprovados++;
            else if (a.getMedia() >= 50)  finais++;
            else                          reprovados++;
        }

        double mediaTurma = somaMedias / alunos.size();

        // Resultados
        System.out.println("\n===== RESULTADO DA TURMA =====");
        System.out.printf("Média da turma: %.2f%n", mediaTurma);
        System.out.println("Aprovados:  " + aprovados);
        System.out.println("Final:      " + finais);
        System.out.println("Reprovados: " + reprovados);

        System.out.println("\nAlunos abaixo da média da turma:");
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getMedia() < mediaTurma) {
                System.out.println("Código [" + i + "] - " + alunos.get(i).getNome()
                    + " (média: " + alunos.get(i).getMedia() + ")");
            }
        }

        sc.close();
    }
}