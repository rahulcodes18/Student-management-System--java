import java.util.Scanner;
public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        int choice;

        do {

            System.out.println("\n=================================");
            System.out.println("   STUDENT MANAGEMENT SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    service.addStudent();
                    break;

                case 2:
                    service.viewStudents();
                    break;

                case 3:
                    service.searchStudent();
                    break;

                case 4:
                    service.updateStudent();
                    break;

                case 5:
                    service.deleteStudent();
                    break;

                case 6:
                    System.out.println("\nThank You... Visit Again!");
                    break;

                default:
                    System.out.println("\nInvalid Choice! Please Try Again.");
            }

        } while (choice != 6);

        sc.close();
    }
}