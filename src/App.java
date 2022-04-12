import java.util.Scanner;
import javax.swing.JOptionPane;
import java.math.*;


public class App {
    public static void main(String[] args) throws Exception {
        exampleMath();
    }

    public static void exampleScanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name?");
        String name = scanner.nextLine();

        System.out.println("your name is " + name);
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
}
