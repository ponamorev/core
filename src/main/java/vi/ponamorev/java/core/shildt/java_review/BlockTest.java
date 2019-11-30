package vi.ponamorev.java.core.shildt.java_review;

/*
    Show using code blocks

    Set source file name 'BlockTest.java'
 */
public class BlockTest {
    public static void main(String[] args) {
        int x, y;

        y = 20;

        // recipient of the loop is that code block
        for (x = 0; x < 10; x++) {
            System.out.println("Value of 'x': " + x);
            System.out.println("Value of 'y': " + y);
            y = y - 2;
        }
    }
}