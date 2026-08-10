public class main {
    public static void main(String[] args) {

        char menuChoice = menu.menu();

        System.out.println("Option " + menuChoice + " chosen");

        switch (menuChoice) {
            case '1':
                delivery.delivery();

                break;
            case '2':

                break;
            case '3':

                break;
            case '4':
                System.out.print("Thank you for using TKS's program!");
                System.exit(0);
        }

    }

}