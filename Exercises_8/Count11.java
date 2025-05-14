package Exercises_8;

public class Count11 {
        public static int array11(int[] nums, int index) {
            if (index >= nums.length) {
                return 0;
            }

            int recurse = array11(nums, index + 1);

            if (nums[index] == 11) {
                return recurse + 1;
            } else {
                return recurse;
            }
        }

        public static void main(String[] args) {
            int[] test1 = {1, 2, 11,7,11,9,11};
            System.out.println("Array [1, 2, 11,7,11,9,11] has " + array11(test1, 0) + " of 11");


        }
    }

