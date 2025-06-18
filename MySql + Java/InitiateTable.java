import java.sql.*;
public class InitiateTable
{
    public static void main(String[] args)
    {
        try
        {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/bd",
                    "root",
                    "Dps3!2006"
            );

            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE Students (Roll_No INT PRIMARY KEY AUTO_INCREMENT, Student_Name VARCHAR(50), Email VARCHAR(100), Age INT)");
            statement.executeUpdate("INSERT INTO Students(Student_Name, Email, Age) VALUES ('Ezio Auditore', 'ezioauditore@gmail.com', 45), ('Altair Ibn-La Ahad', 'altair@yahoo.com', 60), ('Bayek of Siwa', 'bayeksiwa@gmail.com', 30)");
            System.out.println("Successfully Updated");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
