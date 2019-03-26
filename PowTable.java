package powtable;

public class PowTable {

    public static void main(String[] args) {

        System.out.println("a\tb\tpower");
        for (int i = 0, b = 1; i < 8; i++, b++) {

            System.out.printf("%d\t%d\t%d\n", i, b, (int) Math.pow(i, b));
        }

    }

}
