import java.sql.*;
import java.util.Scanner;
public class LoginPage {
    Scanner sc = new Scanner(System.in);
    StudentLogin stulogin = new StudentLogin();
    TeacherLogin teachlogin = new TeacherLogin();
    StaffLogin staffLogin = new StaffLogin();

    private Connection connection() throws SQLException
    {
        return DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/bd",
                "root",
                "Dps3!2006"
        );
    }
    public void studentLogin()
    {
        try(Connection connection = connection())
        {
            System.out.print("Please enter your admission number: ");
            int admid = sc.nextInt();
            String password = sc.nextLine();
            System.out.print("Please enter your password: ");
            password = sc.nextLine();
            PreparedStatement ps = connection.prepareStatement("SELECT Password FROM Students WHERE AdmId = ?");
            ps.setInt(1, admid);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                if(rs.getString("Password").equals(password)) stulogin.menu();
                else System.out.println("Invalid Password");
            }
            else System.out.println("Invalid Id");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void teacherLogin()
    {
        try(Connection connection = connection())
        {
            System.out.print("Please enter your Employee Id: ");
            int empId = sc.nextInt();
            String password = sc.nextLine();
            System.out.print("Please enter your password: ");
            password = sc.nextLine();
            PreparedStatement ps = connection.prepareStatement("SELECT Password FROM Teachers WHERE EmpId = ?");
            ps.setInt(1, empId);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                if(rs.getString("Password").equals(password)) teachlogin.menu();
                else System.out.println("Invalid Password");
            }
            else System.out.println("Invalid Id");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void staffLogin()
    {
        System.out.println("Welcome Staff :>");
        staffLogin.menu();
    }
}