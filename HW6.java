public class HW6 {
    public static void main(String[] args) {
        int[] marks = {78, 82, 91, 65, 34}; 
        int total = 0;
        boolean fail = false;

        for (int mark : marks) {
            total += mark; 
            if (mark < 35) {
                fail = true;
            }
        }

        System.out.println("Total Marks: " + total);
        double average = total / (double) marks.length;
        System.out.println("Average Marks: " + average);

        if (fail) {
            System.out.println("Result: Fail");
        } else {
            System.out.println("Result: Pass");
            if (average >= 90) {
                System.out.println("Grade: A");
            } else if (average >= 75) {
                System.out.println("Grade: B");
            } else if (average >= 60) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D");
            }
        }
    }
}
