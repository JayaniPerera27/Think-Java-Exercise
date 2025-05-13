package Exercises_7;

public class Array {
    public static void main(String[] args){
        // create array
        /*int[] counts = new int[4];

        counts = new int[] {1,2,3,4};*/

        int[] counts = {1,2,3,4};

        System.out.println(counts);

        for (int i=0 ; i< counts.length ; i++ ){
            System.out.print(counts[i]);
        }
        System.out.println();

        //copy array

        int[] b = counts;
        for (int i=0 ; i< counts.length ; i++ ){
            System.out.print(b[i]);
        }





    }
}
