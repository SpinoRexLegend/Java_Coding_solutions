import java.util.Scanner;
public class StudentLogin
{
    Student student = new Student();
    Scanner sc = new Scanner(System.in);

    public void viewSingle()
    {
        System.out.print("Enter Admission Id: ");
        int admId = sc.nextInt();
        student.viewAll();
    }
    public void viewAttenRanking()
    {
        student.viewAttRanking();
    }
    public void menu()
    {
        int choice;
        do{
            System.out.println("Press 1 to view Profile\nPress 2 to view Attendance wise ranking");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    viewSingle();
                    break;
                case 2:
                    viewAttenRanking();
                    break;
                default:
                    return;
            }
        } while(choice != 0);
    }
}
