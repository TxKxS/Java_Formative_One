import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            char menuChoice = menu.menu(input);

            System.out.println("Option " + menuChoice + " chosen");

            switch (menuChoice) {
                case '1':
                    delivery.delivery(input);
                    payment.payment();
                    System.out.println("Member details updated\n");
                    break;
                case '2':
                    if (HarvestLog.deliveries.size() != 0) {
                        TotalPerMember.display();
                        weeklyVolumeGrid.display();
                        topFive.display();
                    } else {System.out.println("No deliveries recorded yet");}
                    break;
                case '3':
                    SeasonReport.writeToFile();
                    break;
                case '4':
                    System.out.print("Thank you for using TKS's program!");
                    //closing scanner object and existing
                    input.close();
                    System.exit(0);

            };

        }

    }

}