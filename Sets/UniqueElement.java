package Sets;
import java.util.*;
import java.util.ArrayList;

public class UniqueElement {
    public static void main(String[] args){
        int[] arr1 = {1,1,2,3,7,8,8,8,2,5,3};
        System.out.println(uniqueEle(arr1));
    }
    public static ArrayList<Integer> uniqueEle (int[] a){
        Set<Integer> newset = new HashSet<>();

        for(int i=0 ; i<a.length ; i++){
            newset.add(a[i]);
        }
        ArrayList<Integer> newarr = new ArrayList<>(newset);
        return newarr;
    }
}
