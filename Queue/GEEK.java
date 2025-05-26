import java.util.*;

class GEEK
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> p = new PriorityQueue<Integer>();

        p.add(10);
        p.add(20);
        p.add(15);

        System.out.println(p);

        // Printing the top element of PriorityQueue
        System.out.println(p.peek());

        // Printing the top element and removing it
        System.out.println(p.poll());

        // Printing the top element again
        System.out.println(p.peek());

        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        System.out.println(pq);
    }
}