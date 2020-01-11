import java.util.Scanner;

/**
 * Created by pravin on 10-01-2020.
 */
public class ArmstrongNumber {


    public static void main(String[] args) {
        System.out.println("Please Enter the Number");
        int number = new Scanner(System.in).nextInt();

        isArmstrong(number);

    }

    private static void isArmstrong(int number){
        int temp = number;
        int remender;
        int sum=0;


        while(number>0){
            remender = number%10;
            number = number/10;
            sum = sum + (remender*remender*remender);
        }
        if(temp == sum) {
            System.out.println("Number "+temp + " Is an armstrong number");
        }else{
            System.out.println("Number "+temp + " Is not an armstrong number");
        }



    }




}
