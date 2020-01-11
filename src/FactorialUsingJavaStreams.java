import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by pravin on 11-01-2020.
 */
public class FactorialUsingJavaStreams {

    public static void main(String[] args) {

        System.out.println("Please Enter the Number to calculate factorial");
        int number = new Scanner(System.in).nextInt();

        System.out.println(IntStream.rangeClosed(1,number).reduce((a,b)->a*b).getAsInt());

    }

}
