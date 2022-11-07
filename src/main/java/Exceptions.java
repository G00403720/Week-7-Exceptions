import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exceptions {
    public static void main(String[] args) {
        int x = 1;
        try{
            System.out.println("Enter a number between 0 - 9 ");
            Scanner newscan = new Scanner(System.in);
            int No = newscan.nextInt();
            if(No <= 9 && No >= 0){
                System.out.println("You entered: " + No);
            }
            else{
                System.out.println("Not a valid number: " + No);
            }
        }
        catch(InputMismatchException a){
            System.out.println("Enter a vaild number");
            while (x > 0){
                System.out.println("Enter a number between 0 - 9 ");
                Scanner newscan = new Scanner(System.in);
                int No2 = newscan.nextInt();
                if(No2 <= 9 && No2 > 0){
                    System.out.println("You entered: " + No2);
                }
                else{
                    System.out.println("Not a valid number: " + No2);
                }
                break;
            }
        }
    }

}
