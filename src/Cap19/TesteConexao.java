package Cap19;

import java.sql.*;
import java.util.List;

public class TesteConexao {

    static String url = "jdbc:mysql://localhost:3306/impacta";
    static String usuario = "root";
    static String senha = "Hig2014@";

    public static void conexaoBanco() throws SQLException {

        Connection connection = null;

        try {

            connection = DriverManager.getConnection(url, usuario, senha);

            //Inserir no BD
            String queryInsert = ("insert into aluno values (?,?,?,?)");

            PreparedStatement preparedStatement = connection.prepareStatement(queryInsert);

            preparedStatement.setNull(1, Types.INTEGER);
            preparedStatement.setString(2, "Renan");
            preparedStatement.setString(3, "25698125896");
            preparedStatement.setInt(4, 8082);

            preparedStatement.executeUpdate();

            //Consultar no BD

            String queryConsult = "SELECT * FROM impacta.aluno";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(queryConsult);

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("idaluno"));
                System.out.println(resultSet.getString("nome"));
                System.out.println(resultSet.getString("cpf"));
                System.out.println(resultSet.getInt("matricula"));
            }


        } catch (SQLException e) {

            System.out.println(e);
        }

    }

    public static void main(String[] args) throws SQLException {
        conexaoBanco();
    }
}
