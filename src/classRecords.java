import java.util.Scanner;

public class classRecords {
    public static void main(String[] args) {
        String name, remarks = "", coursecode, coursetitle;
        double marks;
        String grades = "";

        Scanner ScNames = new Scanner(System.in);
        Scanner ScCourseCodes = new Scanner(System.in);
        Scanner ScCourseTitle = new Scanner(System.in);
        Scanner ScMarks = new Scanner(System.in);

        System.out.println("Enter Student's Name: ");
        name = ScNames.nextLine();

        System.out.println("Enter Student's Course Code: ");
        coursecode = ScCourseCodes.nextLine();

        System.out.println("Enter Student's Course Title: ");
        coursetitle = ScCourseTitle.nextLine();

        System.out.println("Enter Student's Marks: ");
        marks = ScMarks.nextDouble();

        // Processing the grades & remarks
        if (marks >= 70 && marks <= 100) {
            grades = "A";
            remarks = "Excellent";
        } else if (marks >= 60 && marks <= 69) {
            grades = "B";
            remarks = "Very Good";
        } else if (marks >= 50 && marks <= 59) {
            grades = "C";
            remarks = "Good";
        } else if (marks >= 45 && marks <= 49) {
            grades = "D";
            remarks = "Fair";
        } else if (marks >= 0 && marks <= 44) {
            grades = "F";
            remarks = "Fail";
        } else {
            System.out.println("Invalid Input");
        }

        System.out.println("Name: " + name + ", \n Remarks: " + remarks + ", \n Grades: " + grades + ", \n Course Title: " + coursetitle);

        ScNames.close();
        ScCourseCodes.close();
        ScCourseTitle.close();
        ScMarks.close();
    }
}
