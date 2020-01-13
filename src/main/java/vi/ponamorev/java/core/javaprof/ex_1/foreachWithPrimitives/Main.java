package vi.ponamorev.java.core.javaprof.ex_1.foreachWithPrimitives;

public class Main {
    public static void main(String[] args) {
        int[] x = {2, 5, 6, 8, 9, 3};

        // Print array elements of x by for cycle
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();

        // Print array elements of x by for each cycle
        for (int i : x) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Change array value
        for (int tmp : x) {
            ++tmp;
            System.out.print(tmp + " ");
        }
        System.out.println();

        // Print array elements of x by for each cycle
        for (int i : x) {
            System.out.print(i + " ");
        }
    }
}