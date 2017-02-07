
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ShoppingDriver
{
    public static void main(String[] args) throws IOException
    {
        boolean exit = false;
        System.out.println("Enter your command. Type help for further assistance.");
        while(!exit)
        {
            System.out.print(">>>");
            Scanner scnr = new Scanner(System.in);
            String input = scnr.nextLine();
            switch(input)
            {
                case "help": helpMethod(); break;
                case "exit": exit = true; break;
                case "load": loadCSV(/*String <Path Name>*/); break;
                case "print": break; //printMethod();
                default:  break;
            }
        }

    }

    public static void helpMethod()
    {
        System.out.println("List of commands: help, exit, " +
            "load ( to load specific files), print(to print all or a specifc set of items). The correct print format is [group|name|index].");
    }

    public static void loadCSV(/*PATH NAME*/)
    {
        //String location = 
        //File file = new File(location);
        //Scanner fileScanner = new Scanner(file);
    }

    public static void printMethod()
    {
    }

    public static void error ()
    {
        System.out.println("Make sure all commands are lower case. Commands: help, load, print, exit.");
    }
}
