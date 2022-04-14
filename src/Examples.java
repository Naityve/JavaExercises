import java.util.*;

import javax.swing.JOptionPane;

public class Examples {
    public static void PrintHelloWorld() {
        System.out.println("Hello World!");
    }

    public static void exampleScanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name?");
        String name = scanner.nextLine();

        System.out.println("your name is " + name);
        scanner.close();
    }

    public static void exampleGUI() {
        
        String name = JOptionPane.showInputDialog("Enter your name");

        JOptionPane.showMessageDialog(null, "Hello" + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));

        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");
    }

    public static void exampleMath() {
        double x = 3.14;
        double y = 16;

        double z = Math.max(x,y);
        double q = Math.sqrt(y);
        double r = Math.round(x);
        double c = Math.ceil(x); // floor() rounds down

        System.out.println(z);
        System.out.println(q);
        System.out.println(r);
        System.out.println(c);

        System.out.print("The hypotenuse of a triangle of sides 12.5 and 7.25 is: ");

        double num1 = 12.5;
        double num2 = 7.25;

        double answer = Math.sqrt((num1*num1)+(num2*num2));

        System.out.print(answer);
    }

    public static void exampleRandom() {
        Random random = new Random();

        int x = random.nextInt(6)+1;

        double y = random.nextDouble();

        System.out.println(x);
        System.out.println(y);

    }

    public static void exampleIf() {
        
        int age = 70;

        if(age>=18 && age<=64) {
            System.out.println("Age Check Passed");
        } else if(age>=65){
            System.out.println("Age Check Failed. Too Old");
        } else {
            System.out.println("Age Check Failed. Too Young");
        }

    }

    public static void exampleSwitch() {

        String day = "Friday";

        switch(day) {
            case "Monday": System.out.println("It is Monday");
            break;
            case "Tuesday": System.out.println("It is Tuesday");
            break;
            case "Wednesday": System.out.println("It is Wednesday");
            break;
            case "Thursday": System.out.println("It is Thursday");
            break;
            case "Friday": System.out.println("It is Friday");
            break;
            case "Saturday": System.out.println("It is Saturday");
            break;
            case "Sunday": System.out.println("It is Sunday");
            break;
            default: System.out.println("Error. Incorrect value for {age}");
            break;
        }

    }

    public static void exampleWhile() {

        int num = 0;

        while(num != 10) {
            System.out.println(num + 1);
            num++;
        }

    }

    public static void exampleNestedLoop() {
        int rows = 8;
        int columns = 32;
        String symbol = "0";

        for(int i = 0; i<=rows; i++) {
            
            System.out.println();

            for(int j=1; j<=columns; j++) {
                System.out.print(symbol);
            }
        }
    }

    public static void exampleArrays() {
        String[] names = {"James","Fred","Rebecca"};

        for(int i=0; i< names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public static void example2dArrays() {
    }

    public static void awaitInput() {
        
        Scanner scanner = new Scanner(System.in);

        String input = "";

        while(input.isEmpty()) {
            input = scanner.nextLine();
            scanner.close();
        }

        System.out.println(input);

    }

    public static void exampleStrings() {

        String name = "Jack";

        boolean result = name.equals("Mary");

        int stringLength = name.length();

        /*

        .charAt()
        .indexOf()
        .isEmpty()
        .toUpperCase()
        .toLowerCase()
        .trim() REMOVES EMPTY SPACES IN A STRING
        .replace(oldChar, newChar)

        */

        System.out.println(result);
        System.out.println(stringLength);

    }

    public static void exampleWrapper() {

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Frank";

        System.out.println(a.hashCode());
    }

    public static void exampleArrayList() {
        // ArrayList = resizeable array

        ArrayList<String> days = new ArrayList<String>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        days.set(0, "Boreday");
        days.remove("Friday");
        days.clear();

        for(int i=0; i<days.size(); i++) {
            System.out.println(days.get(i));
        }

    }

    public static void example2DArrayList() {

        ArrayList<ArrayList<String>> groceries = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("tomatoes");
        produceList.add("zuchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("soda");
        drinksList.add("coffee");

        groceries.add(bakeryList);
        groceries.add(produceList);
        groceries.add(drinksList);

        System.out.println(groceries);
        System.out.println(groceries.get(0));
        System.out.println(groceries.get(0).get(0));

    }

    public static void exampleForEach() {

        String[] animals = {"cat", "dog", "bird"};

        ArrayList<String> drinks = new ArrayList<String>();

        drinks.add("coca-cola");
        drinks.add("water");
        drinks.add("coffee");

        for(String i : drinks) {
            System.out.println(i);
        }

    }

    //////////////////////////////////////////////////////////////////////
    public static void exampleMethods() {

        int age = 30;

        String name = "Josh";

        exampleMethods_hello(name, age);

        int x = 3;
        int y = 4;
        int z;

        z = exampleMethods_sum(x, y);
        
        System.out.println(z);
    }

    static void exampleMethods_hello(String name, int age) {
        System.out.println("Hello "+name);
        System.out.println("You are "+age);
    }

    static int exampleMethods_sum(int x, int y) {
        int z = x + y;
        return z;
    }
    //////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////
    public static void exampleOverloadedMethods() {

        int a, b, c;
        a = 5;
        b = 10;
        c = 15;

        System.out.println(add(a, b));
        System.out.println(add(a, b, c));

    }

    static int add(int a, int b) {
        return a+b;
    }
    
    static int add(int a, int b, int c) {
        return a+b+c;
    }
    //////////////////////////////////////////////////////////////////////

    public static void examplePrintf() {

        System.out.printf("this is a format string %d", 123);

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Hello";
        int myInt = 50;
        double myDouble = 1000;

        System.out.printf("%b , %c , %s , %d, %f", myBoolean, myChar, myString, myInt, myDouble);

    }

    public static void exampleFinalKeyword() {

        // final variables cannot be changed once instanciated

        final double PI = 3.14159;

        System.out.println(PI);

    }

    




































}
