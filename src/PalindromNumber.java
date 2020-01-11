import java.util.Scanner;

public class PalindromNumber {

    public static void main(String[] args) {
        System.out.println("Please Enter the Number");
        int number = new Scanner(System.in).nextInt();

        isPalindrom(number);

    }


    private static void isPalindrom(int number){
        int temp = number;
        int remender;
        int result=0;


        while(number>0){
            remender = number%10;
            number = number/10;
            result = (result*10)+remender;
        }
        if(temp == result) {
            System.out.println("Number "+temp + " Is a palindrome");
        }else{
            System.out.println("Number "+temp + " Is not a palindrome");
        }



    }



}
