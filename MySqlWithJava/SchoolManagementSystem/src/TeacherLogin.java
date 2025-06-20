import java.util.Scanner;
public class TeacherLogin
{
    Student student = new Student();
    Teachers teachers = new Teachers();
    Scanner sc = new Scanner(System.in);
    public void viewProfile()
    {
        System.out.print("Enter Employee Id: ");
        int empId = sc.nextInt();
        teachers.viewProfile(empId);
    }
    public void updateStudent()
    {
        System.out.print("Enter Admission Id: ");
        int admId = sc.nextInt();
        student.updateAtttenAndGrade(admId);
    }
    public void viewSingle()
    {
        System.out.print("Enter Admission Id: ");
        int admId = sc.nextInt();
        student.viewAll();
    }
    public void menu()
    {
        int choice;
        do{
            System.out.println("Press 1 to view Profile\nPress 2 to update Students attendance and grade\nPress 3 to view Attendance wise ranking\nPress 4 to view student database");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    viewProfile();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    student.viewAttRanking();
                    break;
                case 4:
                    viewSingle();
                    break;
                default:
                    return;
            }
        } while(choice != 0);
    }
}
