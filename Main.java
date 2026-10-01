public class Main {

    public static void main(String[] args) {

        String name = "Rahul";
        int marks = 82;

        String grade;

        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 75) {
            grade = "B";
        } else if (marks >= 60) {
            grade = "C";
        } else if (marks >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
