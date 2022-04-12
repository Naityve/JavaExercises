import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        exampleWhile();
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
}
