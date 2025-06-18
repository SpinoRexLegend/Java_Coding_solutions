import java.sql.*;
import java.util.Scanner;

public class DatabaseFunctions {

    public Connection connection() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/bd",
                "root",
                "Dps3!2006"
        );
    }

    public void delete(int rollNo) {
        try (Connection connection = connection()) {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM Students WHERE Roll_No = ?");
            ps.setInt(1, rollNo);
            ps.executeUpdate();
            System.out.println("Successfully Deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addStudents(String name, String email, int age) {
        try (Connection connection = connection()) {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO Students(Student_Name, Email, Age) VALUES (?, ?, ?);");
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt(3, age);
            ps.executeUpdate();
            System.out.println("Successfully Added");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateDetails(int roll) {
        Scanner sc = new Scanner(System.in);
        try (Connection connection = connection()) {

            System.out.println("Press 1 for altering name\nPress 2 for updating email\nPress 3 for updating age");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); // buffer remover

            PreparedStatement ps = null;//Initialisation

            if (ch == 1) {
                System.out.print("Enter new name: ");
                String name = sc.nextLine();
                ps = connection.prepareStatement("UPDATE Students SET Student_Name = ? WHERE Roll_No = ?");
                ps.setString(1, name);
            } else if (ch == 2) {
                System.out.print("Enter new email: ");
                String email = sc.nextLine();
                ps = connection.prepareStatement("UPDATE Students SET Email = ? WHERE Roll_No = ?");
                ps.setString(1, email);
            } else if (ch == 3) {
                System.out.print("Enter new age: ");
                int age = sc.nextInt();
                ps = connection.prepareStatement("UPDATE Students SET Age = ? WHERE Roll_No = ?");
                ps.setInt(1, age);
            } else {
                System.out.println("Invalid choice.");
                return;
            }

            ps.setInt(2, roll);
            ps.executeUpdate();
            System.out.println("Successfully Updated");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void viewStudent(int rollNo) {
        try (Connection connection = connection()) {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM Students WHERE Roll_No = ?");
            ps.setInt(1, rollNo);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Roll No: " + rs.getInt("Roll_No"));
                System.out.println("Name   : " + rs.getString("Student_Name"));
                System.out.println("Email  : " + rs.getString("Email"));
                System.out.println("Age    : " + rs.getInt("Age"));
            } else {
                System.out.println("No student found with Roll_No = " + rollNo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}