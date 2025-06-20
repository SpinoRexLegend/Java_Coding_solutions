import java.sql.*;
public class LoadThisFirst
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
            statement.executeUpdate("CREATE TABLE Students(AdmId INT PRIMARY KEY AUTO_INCREMENT, Name VARCHAR(50), Date_of_birth DATE, Gender Varchar(10), Attendance DECIMAL(5,2), Grade VARCHAR(20), Course VARCHAR(50), Password VARCHAR(20))");
            statement.executeUpdate("CREATE TABLE Teachers(EmpId INT PRIMARY KEY AUTO_INCREMENT, Name VARCHAR(50), Date_of_birth DATE, Subject_Of_Expertise VARCHAR(20), Gender Varchar(10), Mobile Varchar(12), Password VARCHAR(20))");
            statement.executeUpdate("INSERT INTO Teachers(Name, Date_of_birth, Subject_Of_Expertise, Gender, Mobile, Password) VALUES ('Anita Sharma', '1980-04-12', 'Mathematics', 'Female', '9876543210', 'password'), ('Rajiv Menon', '1975-09-30', 'Physics', 'Male', '9123456780', 'password');");
            statement.executeUpdate("INSERT INTO Students(Name, Date_of_birth, Gender, Attendance, Grade, Course, Password) VALUES ('Sanya Kapoor', '2006-08-30', 'Female', 74.89, 'Excellent', 'Advanced Physics', 'password'), ('Ishaan Roy', '2007-11-02', 'Male', 95.00, 'Outstanding', 'Computer Science', 'password');");
            System.out.println("Succesfully updated...");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
