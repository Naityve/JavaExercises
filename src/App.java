import java.util.*;

import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
        Display();
    }

    public static void Display() {

        String[] height = new String[8];
        String[] width = new String[32];

        String[][] map = new String[8][32];

        map[0][0] = "/";

        String symbol_buffer = "/";

        // Initialise the display with emptySpace symbols : '/'

        for(int i=0; i<height.length; i++) {
            for(int j=0; j<width.length; j++) {

                width[j] = symbol_buffer;

            }

        }

        // Prints out the display

        for(int i=0; i<height.length; i++) {

            System.out.println();

            for(int j=0; j<width.length; j++) {

                System.out.print(width[j]);

            }
        }
    }

    public static void clearDisplay() {
        System.out.println("\033[H\033[2J");
    }

}
