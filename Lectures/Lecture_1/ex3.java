package Lectures.Lecture_1;

/*Write a program to input 3 integers and print the largest ad
the smallest of the 3 numbers entered. */

import java.util.Scanner;
public class ex3 {

    public static void main(String [] args){
            
            int num1, num2, num3, largest, smallest;
            Scanner sc= new Scanner(System.in);
    
            System.out.print("Enter first number: ");
            num1 = sc.nextInt();
    
            System.out.print("Enter second number: ");
            num2 = sc.nextInt();
    
            System.out.print("Enter third number: ");
            num3 = sc.nextInt();
    
            if(num1>num2 && num1>num3){
                largest = num1;
            }
            else if(num2>num1 && num2>num3){
                largest = num2;
            }
            else{
                largest = num3;
            }
    
            if(num1<num2 && num1<num3){
                smallest = num1;
            }
            else if(num2<num1 && num2<num3){
                smallest = num2;
            }
            else{
                smallest = num3;
            }
    
            System.out.println("Largest number is: "+largest);
            System.out.println("Smallest number is: "+smallest);
    }
    
}
