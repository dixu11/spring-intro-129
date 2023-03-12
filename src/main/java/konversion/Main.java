package konversion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner odczyt = new Scanner(new File("file1.json"));

        String text = odczyt.nextLine();
        System.out.println(text);




    }
}
