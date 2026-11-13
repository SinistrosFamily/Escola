
public class Funcionario {

    private int id;
    private String nome;
    private String email;

    public Funcionario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Funcionario(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }

    public String toString() {
        return id + " - " + nome + " - " + email;
    }
}
