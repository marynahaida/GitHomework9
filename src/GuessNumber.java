import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int numberPC = random.nextInt(10) + 1;
        Scanner userScanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10");
        int usersNumber = userScanner.nextInt();
        int a = 0;
        while (a < 3) {
            if (usersNumber == numberPC){
                System.out.println("Number founded. Congratulation!!!");
                a=5;
                break;
            }
            System.out.println("Try again. Enter a number");
            usersNumber = userScanner.nextInt();
            a++;
        }
        if(a !=5 ){
        System.out.println("You didn't guess a number. It was " + numberPC);}
    }
}
