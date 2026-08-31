import java.util.Scanner;

public class menu {

    public static char menu (Scanner input) {

        String strInput = "";
        char menuChoice = ' ';

        do {

            //menu
            System.out.println("\nREKOLT PRODUCE TRACKER - season 2026");
            System.out.println("1. Record a delivery");
            System.out.println("2. Season figures on screen");
            System.out.println("3. Generate the season report");
            System.out.println("4. Exit");
            System.out.println();

            //Ask for choice
            System.out.print("Please enter your choice: ");

            //input choise & verification
            strInput = input.next(); //Enter in a string to keep menuChar as ' '
            if (strInput.length() == 1) {
                menuChoice = strInput.charAt(0); //if a
            } else {
                System.out.println("Invalid choice. Please enter a single character (1 - 4).");
                System.out.println();
                continue;
            }

            //verification
            if (menuChoice < '1' || menuChoice > '4') {
                System.out.println("Invalid choice.");
                System.out.println("Please enter a number between 1 to 4");
                System.out.println();
            }


        } while (menuChoice < '1' || menuChoice > '4'); //Will loop until correct input is entered. Each character has unique ascii so should work

        //closing and exiting
        return menuChoice;

    }
}