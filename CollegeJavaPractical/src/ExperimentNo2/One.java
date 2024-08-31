package ExperimentNo2;

import java.io.Console;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("Enter Your Name:");
        String name = console.readLine();
        System.out.println("Welcome"+name+"to java world");
    }
}
