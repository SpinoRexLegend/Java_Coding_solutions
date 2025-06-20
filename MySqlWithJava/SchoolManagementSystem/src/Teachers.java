import java.sql.*;
import java.util.Scanner;

public class Teachers {
    private Connection connection() throws SQLException
    {
        return DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/bd",
                "root",
                "Dps3!2006"
        );
    }

    public void viewProfile(int empId)
    {
        try(Connection connection = connection())
        {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM Teachers WHERE EmpId = ?");
            ps.setInt(1, empId);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                System.out.print("Employee Id : "+rs.getInt("EmpId"));
                System.out.print("\nName : "+rs.getString("Name"));
                System.out.print("\nDate_of_Birth : "+rs.getString("Date_of_Birth"));
                System.out.print("\nSubject of Expertise : "+rs.getString("Subject_of_Expertise"));
                System.out.print("\nGender : "+rs.getString("Gender"));
                System.out.println("\nMobile Number : "+rs.getDouble("Mobile"));
            }
            else
                System.out.println("Invalid Employee id");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void updateTeachers(int empId)   //Staff
    {
        Scanner sc = new Scanner(System.in);
        try (Connection connection = connection()) {
            System.out.println("Press 1 for Updating Name\nPress 2 for updating Date_of_Birth\nPress 3 for updating Subject of Expertise\nPress 4 for updating Gender\nPress 5 for updating ContactInfo");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); // buffer remover

            PreparedStatement ps = null;//Initialisation

            if (ch == 1) {
                System.out.print("Enter new Name: ");
                String name = sc.nextLine();
                ps = connection.prepareStatement("UPDATE Teachers SET Name = ? WHERE EmpId = ?");
                ps.setString(1, name);
            } else if (ch == 2) {
                System.out.print("Enter new DOB: ");
                String date = sc.nextLine();
                ps = connection.prepareStatement("UPDATE Teachers SET Date_of_Birth = ? WHERE EmpId = ?");
                ps.setString(1, date);
            } else if (ch == 3) {
                System.out.print("Enter new Subject Of Expertise: ");
                String subject = sc.nextLine();
                ps = connection.prepareStatement("UPDATE Teachers SET Subject_of_Expertise = ? WHERE EmpId = ?");
                ps.setString(1, subject);
            } else if (ch == 4) {
                System.out.print("Enter new Gender: ");
                String gender = sc.nextLine();
                ps = connection.prepareStatement("UPDATE Students SET Gender = ? WHERE EmpId = ?");
                ps.setString(1, gender);
            } else if (ch == 5) {
                System.out.print("Enter new Contact: ");
                String contact = sc.nextLine();
                ps = connection.prepareStatement("UPDATE Students SET Mobile = ? WHERE EmpId = ?");
                ps.setString(1, contact);
            } else {
                System.out.println("Invalid choice.");
                return;
            }
            ps.setInt(2, empId);
            ps.executeUpdate();
            System.out.println("Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
