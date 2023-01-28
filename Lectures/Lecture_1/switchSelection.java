package Lectures.Lecture_1;
import java.util.Scanner;

public class switchSelection {

    public static void main(String[] args){

        int num;
        Scanner sc= new Scanner(System.in);


        System.out.print("Enter number:  ");
        num=sc.nextInt();

        switch(num){
            case 1: System.out.println("One");
                    break;
            case 2: System.out.println("Two");
                    break;
            case 3: System.out.println("Three");
            
        }
    }
    
}
