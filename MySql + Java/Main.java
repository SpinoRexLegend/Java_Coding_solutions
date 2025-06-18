import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        DatabaseFunctions databaseFunctions = new DatabaseFunctions();
        int roll, age;
        String name, email;
        System.out.println("Press 1 for deleting a student\nPress 2 for adding a student\nPress 3 for Viewing a student details\nPress 4 for updating database\n\nEnter your choice:");
        int ch =  sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter thy roll number: ");
                roll = sc.nextInt();
                databaseFunctions.delete(roll);
                break;
            case 2:
                System.out.println("Enter thy name: ");
                name = sc.nextLine();
                System.out.println("Enter thy email id: ");
                email = sc.next();
                System.out.println("Enter thy age: ");
                age = sc.nextInt();
                databaseFunctions.addStudents(name, email, age);
                break;
            case 3:
                System.out.println("Enter thy roll number: ");
                roll = sc.nextInt();
                databaseFunctions.viewStudent(roll);
                break;
            case 4:
                System.out.println("Enter thy roll number: ");
                roll = sc.nextInt();
                databaseFunctions.updateDetails(roll);
                break;
            default:
                System.out.println("Invalid input");

        }
    }
}