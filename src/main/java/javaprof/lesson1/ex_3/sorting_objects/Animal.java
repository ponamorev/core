package javaprof.lesson1.ex_3.sorting_objects;

public class Animal implements Comparable<Animal> {
    private String breed;
    private int weight;
    private int speed;
    private int price;

    public Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    /*
        Custom implementation of compareTo()
     */
//    @Override
//    public int compareTo(Animal animal) {
//        // Compare by breed first
//        char[] breedOwner = this.breed.toCharArray();
//        char[] breedComparable = animal.breed.toCharArray();
//
//        for (int i = 0; i < Math.max(breedOwner.length, breedComparable.length); i++) {
//            char symbolOwner = breedOwner[i];
//            char symbolComparable = breedComparable[i];
//            if (symbolOwner != 0 && symbolComparable != 0) {
//                if (symbolOwner > symbolComparable) return 1;
//                if (symbolOwner < symbolComparable) return -1;
//            } else if (symbolOwner == 0) return -2;
//            else return 2;
//        }
//
//        // In case called animal has the same breed as the compared animal - compare by weights
//        if (this.weight > animal.weight) return 3;
//        if (this.weight < animal.weight) return -3;
//
//        // In case the same weights they will be compared by speed
//        if (this.speed > animal.speed) return 4;
//        if (this.speed < animal.speed) return -4;
//
//        // In case the same speeds they will be compared by price
//        if (this.price > animal.price) return 5;
//        if (this.price < animal.price) return -5;
//
//        // If all vars are the same - the animals are the same too
//        return 0;
//    }

    /*
        Custom implementation of compareTo()
        version 2
     */
    @Override
    public int compareTo(Animal animal) {
        int result = this.breed.compareTo(animal.breed);
        if (result == 0)
            result = this.weight - animal.weight;
        if (result == 0)
            result = this.speed - animal.speed;
        if (result == 0)
            result = this.price - animal.price;
        return result;
    }

    /*
        Custom implementation of compareTo()
        version 3
     */
//    @Override
//    public int compareTo(Animal animal) {
//        return this.breed.compareTo(animal.breed) == 0
//                ? this.weight - animal.weight == 0
//                    ? this.speed - animal.speed == 0
//                        ? this.price - animal.price
//                        : this.speed - animal.speed
//                    : this.weight - animal.weight
//                : this.breed.compareTo(animal.breed);
//    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}