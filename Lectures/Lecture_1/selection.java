package Lectures.Lecture_1;

import java.util.Scanner;

public class selection {

    public static void main(String[] args){

        int num;
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter marks:  ");
        num=sc.nextInt();

        if(num>=75){
            System.out.println("A");
        }
        else if(num>=65){
            System.out.println("B");
        }
        else if(num>=55){
            System.out.println("C");
        }
        else if(num>=45){
            System.out.println("D");
        }
        else{
            System.out.println("Fail");
        }

    }
    
}
