import java.util.Scanner;

/**
 * Created by pravin on 11-01-2020.
 */
public class FactorialUsingRecursion {

    public static void main(String[] args) {
        System.out.println("Please Enter the Number to calculate factorial");
        int number = new Scanner(System.in).nextInt();
        System.out.println(factorial(number));
    }

    private static int factorial(int number){
        if(number ==1){
            return 1;
        }

        return number * factorial(number-1);
    }

}
