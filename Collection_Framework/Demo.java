package Collection_Framework;

import java.util.ArrayList;
import java.util.Collection;

public class Demo {
    public static void main(String[] args){

        Collection<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);

        System.out.println(nums);

        for(int n : nums){
            System.out.println(n);
        }

    }
}
