package Lectures.Lecture_1;

/*• Write a java program to input the length and the width of a
rectangle and calculate and print the perimeter. */

import java.util.Scanner;
public class ex2 {

    public static void main(String[] args){
            
            int length, width, perimeter;
    
            Scanner sc= new Scanner(System.in);
    
            System.out.print("Enter length: ");
            length = sc.nextInt();
    
            System.out.print("Enter width: ");
            width = sc.nextInt();
    
            perimeter = 2*(length+width);
    
            System.out.println("Perimeter is: "+perimeter);
    }
    
}
