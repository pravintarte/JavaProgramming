import java.util.Scanner;

/**
 * Created by pravin on 10-01-2020.
 */
public class PalindromeString {


    public static void main(String[] args) {
        System.out.println("Please Enter the Number");
        String inputString = new Scanner(System.in).next();

        isPalindrom(inputString);

    }


    private static void isPalindrom(String number){

        char[] charArray = number.toCharArray();
        StringBuffer result = new StringBuffer();
        for(int i=charArray.length-1;i>=0;i--){
            result =result.append(charArray[i]);
        }

        if(number.equals(result.toString())){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not a Palindrome");
        }


    }

}
