package bai7.baithuchanh1;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
            System.out.println(animals[i].makeSound());

            if(animals[i] instanceof Chicken){
                Edible edible = (Chicken) animals[i];
                System.out.println(edible.howToEat());
            }
        }

        Fruit[] fruit = new Fruit[2];
            fruit[0] = new Apple();
            fruit[1] = new Orange();
        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i].howToEat());
        }


    }
}
