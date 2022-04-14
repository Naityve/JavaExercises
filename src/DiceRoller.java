import java.util.Random;

public class DiceRoller {

    DiceRoller() {
        Random random = new Random();
        int num = 0;
        num = roll(random, num);
        System.out.println(num);
    }

    int roll(Random random, int number) {
        number = random.nextInt(6)+1;
        return number;
    }
}