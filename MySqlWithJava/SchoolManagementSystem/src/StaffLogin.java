import java.util.Scanner;
public class StaffLogin
{
    Student student = new Student();
    Teachers teachers = new Teachers();
    Scanner sc = new Scanner(System.in);
    public void viewTeacherProfile()
    {
        System.out.print("Enter Employee Id: ");
        int empId = sc.nextInt();
        teachers.viewProfile(empId);
    }
    public void updateAllStudents()
    {
        System.out.print("Enter Admission Id: ");
        int admId = sc.nextInt();
        student.updateAllStudents(admId);
    }
    public void updateAllTeachers()
    {
        System.out.print("Enter Employee Id: ");
        int empId = sc.nextInt();
        teachers.updateTeachers(empId);
    }
    public void attendenceWiseRanking()
    {
        student.viewAttRanking();
    }
    public void viewAll()
    {
        System.out.print("Enter Admission Id: ");
        int admId = sc.nextInt();
        student.viewAll();
    }
    public void menu()
    {
        int choice;
        do{
            System.out.println("Press 1 to view Teachers Profile\nPress 2 to update Students Database\nPress 3 to view  Students Attendance wise ranking\nPress 4 to view student database\nPress 5 to update Teachers Database");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    viewTeacherProfile();
                    break;
                case 2:
                    updateAllStudents();
                    break;
                case 3:
                    attendenceWiseRanking();
                    break;
                case 4:
                    viewAll();
                    break;
                case 5:
                    updateAllTeachers();
                    break;
                default:
                    return;
            }
        } while(choice != 0);
    }
}
