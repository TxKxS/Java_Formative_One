import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char menuChoice = menu.menu(input);

        System.out.println("Option " + menuChoice + " chosen");

        switch (menuChoice) {
            case '1':
                delivery.delivery(input);


                break;
            case '2':

                break;
            case '3':

                break;
            case '4':
                System.out.print("Thank you for using TKS's program!");
                System.exit(0);




            //closing scanner object
            input.close();
        }

    }

}