package test;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Witaj świecie!");

        Scanner reader = new Scanner(System.in);
        String input;
        do {
            System.out.println("Aby zamknąć aplikację, trzeba wpisać exit i nacisnąć klawisz enter");
            input = reader.nextLine();
        } while(!"exit".equals(input));

        reader.close();
        System.exit(1);
    }
}
