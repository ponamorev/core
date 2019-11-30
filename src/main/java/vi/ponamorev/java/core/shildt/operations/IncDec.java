package vi.ponamorev.java.core.shildt.operations;

/**
 * Class shows using increment operation
 * @author Vyacheslav Ponamorev
 */
class IncDec {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c, d;
        c = ++b;
        d = a++;
        c++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}