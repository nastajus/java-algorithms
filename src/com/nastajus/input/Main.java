package com.nastajus.input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        GetInputFromFile2(new File("src/com/nastajus/input/words.txt"));
        //note: tested in IDE JetBrains IntelliJ, path variable expected to operate differently in Eclipse, or perhaps by command-line as well
        GetInputFromFile(new File("src/com/nastajus/input/words.txt"));
        GetInputFromConsole();
    }

    //
    static void GetInputFromFile2(File file) {
        try {
            String content = new Scanner(file).useDelimiter("\\Z").next();
            System.out.println("file content: \"" + content + "\"");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println();
    }

    static void GetInputFromFile(File file) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));

            //note: limitations of reader.readLine() is entire string, or reader.read() is one character at a time.
            String line;
            int lineNum = 0;
            while ((line = reader.readLine()) != null) {
                lineNum ++;
                System.out.println("line # " + lineNum + " : " + line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //uncertain if "console" is a correct equivalent term to "System.in"... really it's an InputStream... to be examined more closely.
    static void GetInputFromConsole() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        String s = in.nextLine();
        System.out.println("You entered string: " + s);

        System.out.println("Enter an integer");
        int i = in.nextInt();
        System.out.println("You entered integer: " + i);

        System.out.println("Enter a float");
        float f = in.nextFloat();
        System.out.println("You entered float: " + f);
    }
}
