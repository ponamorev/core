package vi.ponamorev.java.core.shildt.java_review;

/*
    Show conditional operator 'if' applying

    Set source file name 'IfSample.java'
 */
class IfSample {
    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("X is less than Y");

        x = x * 2;
        if (x == y) System.out.println("X is equal to Y now");

        x = x * 2;
        if (x > y) System.out.println("X is bigger than Y now");

        if (x == y) System.out.println("You will not see this text");
    }
}