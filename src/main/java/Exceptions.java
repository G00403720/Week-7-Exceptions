import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exceptions {
    public static void main(String[] args) {
        try{
            System.out.println("Enter a number between 0 - 9 ");
            Scanner newscan = new Scanner(System.in);
            int No = newscan.nextInt();
            if(No <= 9 && No > 0){
                System.out.println("You entered: " + No);
            }
            else{
                System.out.println("Not a valid number: " + No);
            }
        }
        catch(InputMismatchException a){
            System.out.println("Enter a vaild number");
        }
    }

}
