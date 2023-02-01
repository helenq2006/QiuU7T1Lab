import java.util.ArrayList;

public class ArrayListWarmup {
    public static void main(String[] args) {
        ArrayList<String> helen = new ArrayList<String>();
        helen.add("minions");
        helen.add("csa");
        helen.add("partynextdoor");
        helen.add("theweeknd");
        System.out.println(helen);

        System.out.println(helen.size());
        String swappedFirst = helen.set(0, "theweeknd");
        String swappedLast = helen.set(3, "minions");
        System.out.println(helen);

        String hello = helen.set(0, "HELLO!");
        System.out.println(helen);
    }
}
