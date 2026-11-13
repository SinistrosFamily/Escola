import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FuncionarioDAO {

    // INSERT
    public void inserir(Funcionario f) {
        String sql = "INSERT INTO funcionario (nome, email) VALUES (?, ?)";
        try {
            Connection conexao = Conexao.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, f.getNome());   // first ?
            stmt.setString(2, f.getEmail());  // second ?
            stmt.executeUpdate();
            System.out.println("Inserted!");
            stmt.close();
            conexao.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // SEARCH
    public Funcionario buscar(int id) {
        String sql = "SELECT * FROM funcionario WHERE id = ?";
        Funcionario f = null;
        try {
            Connection conexao = Conexao.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();  
            if (result.next()) {
                f = new Funcionario(result.getInt("id"),
                                    result.getString("nome"),
                                    result.getString("email"));
            }
            result.close();
            stmt.close();
            conexao.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return f;
    }

    // UPDATE
    public void atualizar(Funcionario f) {
        String sql = "UPDATE funcionario SET nome = ?, email = ? WHERE id = ?";
        try {
            Connection conexao = Conexao.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getEmail());
            stmt.setInt(3, f.getId());
            stmt.executeUpdate();
            System.out.println("Updated!");
            stmt.close();
            conexao.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // DELETE
    public void deletar(int id) {
        String sql = "DELETE FROM funcionario WHERE id = ?";
        try {
            Connection conexao = Conexao.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Deleted!");
            stmt.close();
            conexao.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
