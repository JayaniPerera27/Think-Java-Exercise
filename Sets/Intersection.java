package Sets;
import java.util.*;

public class Intersection {
    public static void main(String[] args){
        int[] arr1 = {1,1,5,6,3,2,2};
        int[] arr2 = {2,3,5,9,7,2,8};

        System.out.println(findIntersection(arr1,arr2));

    }
    public static Set<Integer> findIntersection (int[] a, int[] b){
        Set<Integer> newset = new HashSet<>();

        for(int i=0 ; i<a.length ; i++){
            for(int j=0 ; j<b.length ; j++){
                if(a[i] == b[j]){
                    newset.add(a[i]);
                }
            }
        }
        //ArrayList<Integer> newarr = new ArrayList<>(newset);
     return newset;
    }
}
