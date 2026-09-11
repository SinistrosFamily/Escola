package Lista;
public class Aluno {
    private String nome;
    private int notaParcial1;
    private int notaParcial2;

    public Aluno(String nome, int notaParcial1, int notaParcial2) {
        this.nome = nome;
        this.notaParcial1 = notaParcial1;
        this.notaParcial2 = notaParcial2;
    }

    public String getNome() { return nome; }
    public int getNotaParcial1() { return notaParcial1; }
    public int getNotaParcial2() { return notaParcial2; }

    public double getMedia() {
        return (notaParcial1 + notaParcial2) / 2.0;
    }
}