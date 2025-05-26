package PriorityQueue;
import java.util.PriorityQueue;

public class Geeks
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> p = new PriorityQueue<>();

        p.add(3);
        p.add(10);
        p.add(7);
        p.add(2);

        // Print the head of the queue
        System.out.println("Head of Queue: " + p.peek());

    }
}
