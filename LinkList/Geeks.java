package LinkList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Geeks {
    public static void main(String args[]) {

        LinkedList<String> l = new LinkedList<>();

        l.add("Geeks");
        l.add("For");
        l.add("Geeks");

        // Creating a ListIterator
        ListIterator<String> it = l.listIterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}