import java.util.Scanner;

/**
 * Created by pravin on 11-01-2020.
 */
public class FactorialUsingLoop {

    public static void main(String[] args) {
        System.out.println("Please Enter the Number to calculate factorial");
        int number = new Scanner(System.in).nextInt();
        int result=1;
        for(int i=number;i>0;i--){
            result = result * i;
        }

        System.out.println(result);
    }


}
