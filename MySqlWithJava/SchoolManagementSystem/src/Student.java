import java.sql.*;
import java.util.Scanner;
public class Student
{
    private Connection connection() throws SQLException
    {
        return DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/bd",
                "root",
                "Dps3!2006"
        );
    }

    public void viewData(int admNo)//Student
    {
        try(Connection conn = connection())
        {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Students WHERE AdmId = ?");
            ps.setInt(1, admNo);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                System.out.println("Roll No: " + rs.getInt("AdmId"));
                System.out.println("Name   : " + rs.getString("Name"));
                System.out.println("Date  : " + rs.getDate("Date_of_birth"));
                System.out.println("Gender    : " + rs.getString("Gender"));
                System.out.println("Attendance    : " + rs.getBigDecimal("Gender"));
                System.out.println("Grade    : " + rs.getString("Grade"));
                System.out.println("Course    : " + rs.getString("Course"));
            } else {
                System.out.println("No student found with Roll_No = " + admNo);
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    public void viewAll()//Teacher
    {
        try(Connection connection = connection())
        {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM Students");
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                System.out.println("Roll No: " + rs.getInt("AdmId"));
                System.out.println("Name   : " + rs.getString("Name"));
                System.out.println("Date  : " + rs.getDate("Date_of_birth"));
                System.out.println("Gender    : " + rs.getString("Gender"));
                System.out.println("Attendance    : " + rs.getDouble("Attendance"));
                System.out.println("Grade    : " + rs.getString("Grade"));
                System.out.println("Course    : " + rs.getString("Course"));
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
    public void updateAtttenAndGrade(int admNo)//Teacher
    {
        Scanner sc = new Scanner(System.in);
        try (Connection connection = connection()) {
            System.out.println("Press 1 for Updating Attendance\nPress 2 for updating Grade");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); // buffer remover

            PreparedStatement ps = null;//Initialisation

            if (ch == 1) {
                System.out.print("Enter new Attendance percentage: ");
                double attendance = sc.nextDouble();
                ps = connection.prepareStatement("UPDATE Students SET Attendance = ? WHERE AdmId = ?");
                ps.setDouble(1, attendance);
            } else if (ch == 2) {
                System.out.print("Enter new Remarks: ");
                String remark = sc.nextLine();
                ps = connection.prepareStatement("UPDATE Students SET Grade = ? WHERE AdmId = ?");
                ps.setString(1, remark);
            } else {
                System.out.println("Invalid choice.");
                return;
            }

            ps.setInt(2, admNo);
            ps.executeUpdate();
            System.out.println("Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void updateAllStudents(int admNo)   //Staff
    {
        Scanner sc = new Scanner(System.in);
        try (Connection connection = connection()) {
            System.out.println("Press 1 for Updating Name\nPress 2 for updating Date_of_Birth\nPress 3 for updating Gender\nPress 4 for updating Attendance Percentage\nPress 5 for updating Remarks\nPress 6 for changing course");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); // buffer remover

            PreparedStatement ps = null;//Initialisation

            if (ch == 1) {
                System.out.print("Enter new Name: ");
                String name = sc.nextLine();
                ps = connection.prepareStatement("UPDATE Students SET Name = ? WHERE AdmId = ?");
                ps.setString(1, name);
            } else if (ch == 2) {
                System.out.print("Enter new DOB: ");
                String date = sc.nextLine();
                ps = connection.prepareStatement("UPDATE Students SET Date_of_Birth = ? WHERE AdmId = ?");
                ps.setString(1, date);
            } else if (ch == 3) {
                System.out.print("Enter new Gender: ");
                String gender = sc.nextLine();
                ps = connection.prepareStatement("UPDATE Students SET Gender = ? WHERE AdmId = ?");
                ps.setString(1, gender);
            } else if (ch == 4) {
                System.out.print("Enter new Attendance percentage: ");
                double attendance = sc.nextDouble();
                ps = connection.prepareStatement("UPDATE Students SET Attendance = ? WHERE AdmId = ?");
                ps.setDouble(1, attendance);
            } else if (ch == 5) {
                System.out.print("Enter new Remarks: ");
                String remark = sc.nextLine();
                ps = connection.prepareStatement("UPDATE Students SET Grade = ? WHERE AdmId = ?");
                ps.setString(1, remark);
            } else if (ch == 6) {
                System.out.print("Enter new Course: ");
                String course = sc.nextLine();
                ps = connection.prepareStatement("UPDATE Students SET Course = ? WHERE AdmId = ?");
                ps.setString(1, course);
            } else {
                System.out.println("Invalid choice.");
                return;
            }
            ps.setInt(2, admNo);
            ps.executeUpdate();
            System.out.println("Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void viewAttRanking() {
        try(Connection connection = connection()) {
            PreparedStatement ps = connection.prepareStatement("SELECT AdmId, Name, Attendance FROM Students ORDER BY Attendance DESC");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                System.out.print("Adm Id : "+rs.getInt("AdmId"));
                System.out.println("\tName : "+rs.getString("Name"));
                System.out.println("\tAttendace : "+rs.getDouble("Attendance"));
                System.out.println();
            }
        }
        catch(SQLException e) {
            throw new RuntimeException(e);
            }
    }
}
