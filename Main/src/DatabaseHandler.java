import java.sql.*;

public class DatabaseHandler {
    private static final String URL = "jdbc:postgresql://localhost:5432/testdb";
    private static final String USER = "postgres";    // твой логин
    private static final String PASSWORD = "root";    // твой пароль

    static {
        try {
            Class.forName("org.postgresql.Driver"); // регистрация драйвера
        } catch (ClassNotFoundException e) {
            System.err.println("PostgreSQL Driver not found.");
            e.printStackTrace();
        }
    }

    public static void insertPerson(Person p) {
        String sql = "INSERT INTO persons (name, age, position, salary, client_id) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, p.getName());
            stmt.setInt(2, p.getAge());

            if (p instanceof Employee) {
                Employee emp = (Employee) p;
                stmt.setString(3, emp.getPosition());
                stmt.setDouble(4, emp.getSalary());
                stmt.setNull(5, Types.VARCHAR);
            } else if (p instanceof Client) {
                Client cl = (Client) p;
                stmt.setNull(3, Types.VARCHAR);
                stmt.setNull(4, Types.NUMERIC);
                stmt.setString(5, cl.getClientId());
            } else {
                stmt.setNull(3, Types.VARCHAR);
                stmt.setNull(4, Types.NUMERIC);
                stmt.setNull(5, Types.VARCHAR);
            }

            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Данные успешно добавлены в базу.");
            } else {
                System.out.println("Ошибка добавления данных.");
            }

        } catch (SQLException e) {
            System.err.println("Ошибка при работе с базой:");
            e.printStackTrace();
        }
    }
}
