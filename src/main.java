import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<String> trees = new ArrayList<String>();
        trees.add("pine");
        trees.add("maple");
        trees.add("frasier fir");
        System.out.println(trees);
        System.out.println(trees.size());

        System.out.println(trees.get(1));
        System.out.println(trees.get(3));

    }
}
