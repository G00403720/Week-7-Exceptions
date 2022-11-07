import java.sql.SQLOutput;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        System.out.println("Enter a number between 0 - 9 ");
        Scanner newscan = new Scanner(System.in);
        int No = newscan.nextInt();

        if(No <= 9 || No > 0){
            System.out.println("You entered: " + No);
        }
        else{
            System.out.println("Not a valid number");
        }
    }

}
