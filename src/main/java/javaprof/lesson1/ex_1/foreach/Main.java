package javaprof.lesson1.ex_1.foreach;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Sphynx", 4000);
        Animal dog = new Animal("Malamute", 3000);
        Animal bird = new Animal("Crow", 2000);

        Animal[] c = {cat, dog, bird};

        for (Animal tmp : c) {
//            tmp.price = tmp.price + 1000;   // You can change field for object
            tmp = new Animal("Lion", 200000);     // You CAN'T change object in the array
        }
        for (Animal tmp : c) {
            System.out.println(tmp.breed + " " + tmp.price);
        }
    }
}