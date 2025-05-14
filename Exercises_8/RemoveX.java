package Exercises_8;

public class RemoveX {
    public static String noX(String str) {
        if (str.length() == 0) {
            return "";
        }

        char first = str.charAt(0);
        String rest = str.substring(1);
        String recurse = noX(rest);

        if (first == 'x') {
            return recurse;
        } else {
            return first + recurse;
        }
    }

        public static void main(String[] args) {

            /*RemoveX remover = new RemoveX();

            String result = remover.noX("axxhhbfxtyx");
            System.out.println(result);*/

            String result = noX("axxhbyrxerxi");
            System.out.println(result);

    }
}
