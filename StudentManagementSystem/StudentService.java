import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {

    ArrayList<Student> studentList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // Add Student
    public void addStudent() {

        System.out.print("Enter Student ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Student Age : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Course : ");
        String course = sc.nextLine();

        Student student = new Student(id, name, age, course);
        studentList.add(student);

        System.out.println("\nStudent Added Successfully.");
    }

    // View Students
    public void viewStudents() {

        if (studentList.isEmpty()) {
            System.out.println("\nNo Student Found.");
            return;
        }

        System.out.println("\n===== Student List =====");

        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    // Search Student
    public void searchStudent() {

        System.out.print("Enter Student ID to Search : ");
        int id = sc.nextInt();

        for (Student student : studentList) {

            if (student.getid() == id) {
                System.out.println("\nStudent Found");
                System.out.println(student);
                return;
            }
        }

        System.out.println("\nStudent Not Found.");
    }

    // Update Student
    public void updateStudent() {

        System.out.print("Enter Student ID to Update : ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student student : studentList) {

            if (student.getid() == id) {

                System.out.print("Enter New Name : ");
                student.setname(sc.nextLine());

                System.out.print("Enter New Age : ");
                student.setage(sc.nextInt());
                sc.nextLine();

                System.out.print("Enter New Course : ");
                student.setcourse(sc.nextLine());

                System.out.println("\nStudent Updated Successfully.");
                return;
            }
        }

        System.out.println("\nStudent Not Found.");
    }

    // Delete Student
    public void deleteStudent() {

        System.out.print("Enter Student ID to Delete : ");
        int id = sc.nextInt();

        for (Student student : studentList) {

            if (student.getId() == id) {
                studentList.remove(student);
                System.out.println("\nStudent Deleted Successfully.");
                return;
            }
        }

        System.out.println("\nStudent Not Found.");
    }
}