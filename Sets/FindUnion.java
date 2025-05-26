package Sets;
import java.util.*;

public class FindUnion {
    public static void main(String[] args){
        int[] arr1 = {2,5,2,7,8,5};
        int[] arr2 = {1,1,2,6,7,8};

        ArrayList<Integer> unionarr = getUnion(arr1,arr2);
        System.out.println(unionarr);

    }
    public static ArrayList<Integer> getUnion (int[] a , int[] b){
        Set<Integer> newSt = new TreeSet<>();

        for(int i=0; i<a.length; i++){
            newSt.add(a[i]);
        }
        for(int i=0; i<b.length; i++){
            newSt.add(b[i]);
        }
        ArrayList<Integer> newarr = new ArrayList<>(newSt);

        return newarr;
    }

}
