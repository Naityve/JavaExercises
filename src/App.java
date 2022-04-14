import java.util.*;

import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
       exampleConstructor();
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
