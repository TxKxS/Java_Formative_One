import java.util.Scanner;

public class menu {

    public static char menu () {

        Scanner input = new Scanner(System.in);

        String strInput = "";
        char menuChoice = ' ';

        do {

            //menu
            System.out.println("REKOLT PRODUCE TRACKER - season 2026");
            System.out.println("1. Record a delivery");
            System.out.println("2. Season figures on screen");
            System.out.println("3. Generate the season report");
            System.out.println("4. Exit");

            //Ask for choice
            System.out.print("Please enter your choice: ");

            //input choise
            strInput = input.next();
            if (strInput.length() == 1) {
                menuChoice = strInput.charAt(0);
            } else {
                System.out.println("Invalid choice. Please enter a single character (1 - 4).");
                continue;
            }

            //verification
            if (menuChoice < '1' || menuChoice > '4') {
                System.out.println("Invalid choice.");
                System.out.println("Please enter a number between 1 to 4");
            }


        } while (menuChoice < '1' || menuChoice > '4'); //Will loop until correct input is entered. Each character has unique ascii so should work



        //closing and exiting
        input.close();
        return menuChoice;

    }
}