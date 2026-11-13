import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection getConexao() throws Exception {
        String url = "jdbc:mysql://localhost:3306/escola";
        String user = "root";
        String passwd = "";   

        return DriverManager.getConnection(url, user, passwd);
    }
}
