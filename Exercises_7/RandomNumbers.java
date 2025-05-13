package Exercises_7;
import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args){
        /*Random number = new Random();
        int a = number.nextInt(6);
        System.out.println(a);*/

        int[] array = randomArray(6);
        System.out.println(Arrays.toString(array));


    }

    public static int[] randomArray(int size){
        Random random = new Random();
        int[] a = new int[size];

        for (int i =0 ; i < size ; i++){ //size or a.length both can use
            a[i] = random.nextInt(100);
        }
        return a;
    }
}
