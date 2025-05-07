package Exercises_4;

public class Question2 {
    public static void main(String[] args) {         // 1
        zippo("rattle", 13);                         // 2
    }

    public static void baffle(String blimp) {
        System.out.println(blimp);                   // 4
        zippo("ping", -5);                           // 5
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + " zoop");    // 6
        } else {
            System.out.println("ik");                // 3
            baffle(quince);                          // 4 (called)
            System.out.println("boo-wa-ha-ha");      // 7
        }
    }

}
