import java.util.Scanner;

public class schoolLevel {
    public static void main(String[] args){
        String name, school;
        int age;

        //prompt user to enter his name and age
        Scanner ScNames = new Scanner(System.in);
        Scanner ScAge = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        name = ScNames.nextLine();

        System.out.println("Enter your Age: ");
        age = ScAge.nextInt();

        // Processing the school and age

        if(age >= 3 && age <= 5){
            school = "NURSERY SCHOOL";
            System.out.println("Hello " + name + ", you are expected to be in " + school);
        }
        else if(age >= 6 && age <= 12){
            school = "PRIMARY SCHOOL";
            System.out.println("Hello " + name + ", you are expected to be in " + school);
        }
        else if(age >= 13 && age <= 19){
            school = "SECONDARY SCHOOL";
            System.out.println("Hello " + name + ", you are expected to be in " + school);
        }
        else{
            school = "UNIVERSITY";
            System.out.println("Hello " + name + ", you are expected to be in " + school);
        }

        ScNames.close();
        ScAge.close();
        

    }    
}
