import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomNumberForArray = new Random();


        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumberForArray.nextInt(50);
            System.out.print(array[i]+" ");
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
            }
        }

        int result = 1;
        for (int i = 0; i < array.length; i++) {
                result = result * array[i];
        }


        System.out.println();
        System.out.println();
        System.out.println("Your min is " + min);
        System.out.println();
        System.out.println("Your max is " + max);
        System.out.println();
        System.out.println("Your sum is "+ result);
 }
}