/*Write a program to display the day of the week when you provide the value.
Expected Output
 Value of the day : 4
Day of the week : Thursday
Good Bye!
You must use “switch – case” statement.
Display “Invalid Day” when some invalid value is provided.
Message “Good Bye” must appear at last.
 */

package lab1Ex1;

public class ex4 {
    
    public static void main(String[] args) {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Day of the week : Monday");
                break;
            case 2:
                System.out.println("Day of the week : Tuesday");
                break;
            case 3:
                System.out.println("Day of the week : Wednesday");
                break;
            case 4:
                System.out.println("Day of the week : Thursday");
                break;
            case 5:
                System.out.println("Day of the week : Friday");
                break;
            case 6:
                System.out.println("Day of the week : Saturday");
                break;
            case 7:
                System.out.println("Day of the week : Sunday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
        System.out.println("Good Bye!");
    }
}
