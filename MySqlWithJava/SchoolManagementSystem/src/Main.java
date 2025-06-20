import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        LoginPage login = new LoginPage();
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu\nPress 1 for Student Login\nPress 2 for Teachers Login\nPress 3 for Staff Login");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1: login.studentLogin(); break;
            case 2: login.teacherLogin(); break;
            case 3: login.staffLogin(); break;
            default: System.out.println("Pray enter a correct choice.");
        }
    }
}