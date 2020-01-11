import sun.applet.Main;

/**
 * Created by pravin on 10-01-2020.
 */
public class SecondSmallestElementInArray {


    public static void main(String[] args) {

        int [] array = {3 ,56,7, 8, 1,-1,2, 3, 4};
        int smallest =Integer.MAX_VALUE;
        int secondSmallest =Integer.MAX_VALUE;

        for(int i=0;i<array.length;i++){
            int num = array[i];
            if(num<smallest){
                int temp = smallest;
                smallest = num;
                secondSmallest = temp;
            }

            if(num<secondSmallest && num>smallest){
                secondSmallest = num;
            }

        }

        System.out.println(secondSmallest);



    }

}
