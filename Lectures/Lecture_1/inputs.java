package Lectures.Lecture_1;
import java.util.*;

public class inputs {

    public static void main(String[] args){

        String name;
        int age;

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter your name:");
        name = sc.next();

        System.out.print("Enter your age:");
        age= sc.nextInt();

        System.out.println("Your name is: "+name);
        System.out.println("Your age is: "+age);
    }
    
}
