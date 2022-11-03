import java.sql.*;

public class Conexion {
    private static Connection connection = null;

    private static final String driver = "com.mysql.cj.jdbc.Driver";

    private static final String url = "jdbc:mysql://localhost:3306/paises";

    private static final String user = "root";

    private static final String pass = "root";

    public static void conexionBD () {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, pass);

            System.out.println("Conexion establecida");
        } catch (ClassNotFoundException ex) {
            System.out.println("No se pudo conectar con la base de datos ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void mostrarPaises() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, pass);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from country");

            while (resultSet.next()){
                System.out.println(resultSet.getString("Pais"));
            }

        } catch (SQLException e) {
            System.out.println("Error al hacer la consulta");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

