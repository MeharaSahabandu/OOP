package Lectures.Lecture_1;

/*• Write a program to input 10 numbers from the keyboard
and find how many odd numbers and how many even
numbers were entered. */

import java.util.Scanner;
public class ex4 {
    
    public static void main(String[] args){
            
            int num, odd=0, even=0;
            Scanner sc= new Scanner(System.in);
            
            for(int i=0; i<10; i++){
                System.out.print("Enter number: ");
                num = sc.nextInt();
                
                if(num%2==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
            
            System.out.println("Number of even numbers: "+even);
            System.out.println("Number of odd numbers: "+odd);
    }
}
