package ArrayList;

import java.util.*;

public class DemoArrayList {
    public static void main(String[] args){
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);

        a1.add(1,90);
        System.out.println(a1);

//        a1.remove(2);
//        System.out.println(a1);
//
//        a1.remove(Integer.valueOf(10));
//        System.out.println(a1);


        // Print the original ArrayList
        System.out.println("Before operation: " + a1);

        // Replace element at
        // index 3 with 9
        int r = a1.set(1, 9);

        System.out.println("After operation: " + a1);
        System.out.println("Replaced element: " + r);

    }
}
