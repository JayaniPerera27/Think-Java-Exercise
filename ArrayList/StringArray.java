package ArrayList;
import java.util.*;

public class StringArray {

        public static void main(String[] args)
        {

            ArrayList<String> al = new ArrayList<>();

            al.add("Anshul Aggarwal");
            al.add("Mayank Solanki");
            al.add("Abhishek Kelenia");
            al.add("Vivek Gupta");

            String[] answer = Arrays.copyOf(al.toArray(), al.size(), String[].class);
            System.out.println(Arrays.toString(answer));
        }

}
