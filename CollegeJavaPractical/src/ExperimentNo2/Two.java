package ExperimentNo2;

import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("Enter Password:");
        char[] ch = console.readPassword();
        System.out.println("Now your password is:");
        for (char ch1 : ch) {
            System.out.print(ch1);
        }
    }
}
