
public class Main {

    public static void main(String[] args) {
        FuncionarioDAO dao = new FuncionarioDAO();

        // 1) insert
        dao.inserir(new Funcionario("Maria", "maria@email.com"));

        // 2) search
        int id = 1;
        System.out.println(dao.buscar(id));

        // 3) update
        dao.atualizar(new Funcionario(id, "Maria Silva", "maria.silva@email.com"));
        System.out.println(dao.buscar(id));

        // 4) delete
        dao.deletar(id);
        System.out.println(dao.buscar(id));   
    }
}
