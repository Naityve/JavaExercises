import java.util.*;

import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
       exampleOverloadedConstructors();
    }

    public static void exampleOverloadedConstructors() {
        Pizza pizza = new Pizza("thick","bbq", "cheddar","sweetcorn");
        System.out.println(pizza.bread);
        System.out.println(pizza.cheese);
        System.out.println(pizza.sauce);
        System.out.println(pizza.topping);
    }

    public static void exampleVariableScope() {
        DiceRoller diceRoller = new DiceRoller();
    }

    public static void exampleConstructor() {
        
        Human human1 = new Human("Bob", 35, 68.2);
        Human human2 = new Human("Fred", 62, 55);

        System.out.println(human1.name);
        human2.eat();
        human1.drink();

    }

    public static void exampleOOP() {

        exampleOOP_Car myCar = new exampleOOP_Car();

        System.out.println(myCar.color);
        System.out.println(myCar.make);
        System.out.println(myCar.model);
        System.out.println(myCar.year);
        myCar.drive();
        myCar.brakes();


        exampleOOP_Car mySecondCar = new exampleOOP_Car();

        System.out.println(mySecondCar.color);
        System.out.println(mySecondCar.make);
        System.out.println(mySecondCar.model);
        System.out.println(mySecondCar.year);

    }

}
