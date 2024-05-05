import java.util.Scanner;

public class App {
    private static String ScNames;
    private static String ScCourseCodes;
    private static String ScCourseTitle;
    private static String ScMarks;
    public static void main(String[] args){
        String name, grades = "", remarks = "", coursecode, coursetitle;
        double marks;


        System.out.println("Enter Student's Name: ");
        Scanner ScNames = new Scanner(System.in);
        name = ScNames.nextLine();

        System.out.println("Enter Student's Course Code: ");
        Scanner ScCourseCodes = new Scanner(System.in);
        coursecode = ScCourseCodes.nextLine();

        System.out.println("Enter Student's Course Title: ");
        Scanner ScCourseTitle = new Scanner(System.in);
        coursetitle = ScCourseTitle.nextLine();

        System.out.println("Enter Student's Marks: ");
        Scanner ScMarks = new Scanner(System.in);
        marks = ScMarks.nextDouble();
        
        
        //processing the grades & remarks

        if(marks >= 70 && marks <= 100){
            grades = "A";
            remarks = "Excellent";
        }

        else if(marks >= 60 && marks <= 69) {
            grades = "B";
            remarks = "Very Good";
        }

        else if(marks >= 50 && marks <= 59){
            grades = "C";
            remarks = "Good";
        }

        else if(marks >= 45 && marks <= 49) {
            grades = "D";
            remarks = "Fair";
        }

        else if( marks >= 0 && marks <= 44) {
            grades = "E";
            remarks = "Fail";
        }
        
        else {
            System.out.println("Invalid Input");
        }


        System.out.println("Name: " + name + ", \n Remarks: " + remarks + ", \n Grades: " + grades + ", \n Course Title: " + coursetitle);

        ScNames.close();
        ScCourseCodes.close();
        ScCourseTitle.close();
        ScMarks.close();

    }
}
