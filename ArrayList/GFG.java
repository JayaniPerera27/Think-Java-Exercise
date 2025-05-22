package ArrayList;
import java.util.*;
class RevArrayList {
    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist)
    {
        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = alist.size() - 1; i >= 0; i--) {
            revArrayList.add(alist.get(i));
        }
        return revArrayList;
    }
}

public class GFG {
    public static void main(String[] args)
    {
        RevArrayList obj = new RevArrayList();

        ArrayList<Integer> arrayli = new ArrayList<>();

        arrayli.add((1));
        arrayli.add( (2));
        arrayli.add( (3));
        arrayli.add((4));
        System.out.print("Elements before reversing:" + arrayli);
        arrayli = obj.reverseArrayList(arrayli);
        System.out.print("\nElements after reversing:" + arrayli);
    }
}