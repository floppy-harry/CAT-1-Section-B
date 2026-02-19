// StudentRecord.java
public class StudentRecord {
    
    // Fields (Attributes)
    private String studentID;
    private String name;
    private String course;

    // Constructor
    public StudentRecord(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}





// StudentApp.java
import java.util.Scanner;

public class StudentApp {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter Student ID: ");
        String id = input.nextLine();

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Course: ");
        String course = input.nextLine();

        // Create StudentRecord object
        StudentRecord student = new StudentRecord(id, name, course);

        // Display student information
        System.out.println("\nStudent Details:");
        student.displayInfo();

        input.close();
    }
}



