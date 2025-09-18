import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Attendance {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int numStudents = s.nextInt();
        s.nextLine(); 

    
        String[] names = new String[numStudents];
        int[] marks = new int[numStudents];

        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = s.nextLine();

           System.out.print("Enter marks of " + names[i] + ": ");
            marks[i] = s.nextInt();
            s.nextLine(); 
        }

        
        System.out.println("\nStudent Details:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Name: " + names[i] + ", Marks: " + marks[i]);
            if (marks[i] < 35) {
                System.out.println("Needs Improvement");
            }
        }

    
        double average = calculateAverage(marks);
        System.out.printf("\nAverage Marks: %.2f\n", average);

        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Program ended at: " + now.format(formatter));

        s.close();
    }

    
    public static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
}
