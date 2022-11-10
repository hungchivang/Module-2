package bai7.baithuchanh1;

public class Chicken extends Animal implements Edible{

    @Override
    public String makeSound(){
        return "Chicken: duck duck";
    }

    @Override
    public String howToEat(){
        return "could be fried";
    }
}
