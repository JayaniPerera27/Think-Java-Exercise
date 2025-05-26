package Sets;
import java.util.*;

public class Disjontion {
    public static void main(String[] args){

        int[] arr1 = {1,1,2,5,6,7};
        int[] arr2 = {3,4,9,8,4,3};

        Newcls obj = new Newcls();

        if(obj.isDisjoin(arr1,arr2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

}
class Newcls{
    public static boolean isDisjoin (int[] a, int[] b){

        for(int i=0 ; i<a.length ; i++){
            for(int j=0 ;j<b.length ; j++){
                if(a[i] == b[j]){
                    return false;
                }
            }
        }return true;
    }
}
