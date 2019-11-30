package vi.ponamorev.java.core.shildt.data_types;

// Calculate circle surface
class Area {
    public static void main(String[] args) {
        double pi, r, a;

        r = 10.8;       // circle radius
        pi = Math.PI;   // PI
        a = pi * r * r; // calculate area

        System.out.println("Circle surface = " + a);
    }
}