import java.util.Scanner;

public class delivery{

    public static void delivery(Scanner input) {


        System.out.println("Record a Delivery");

        System.out.println("Please enter the following details: ");
        System.out.print("Member Identifier: ");
        String strMemberId = input.next();

        System.out.print("Member Name: ");
        String strMemberName = input.next();

        System.out.print("Produce Code: ");
        String strProduceCoce = input.next();

        System.out.print("Mass (in Kg): ");
        float fltMass = input.nextFloat();

        System.out.print("Quality Score (0-100): ");
        int intQualityScore = input.nextInt();

        System.out.print("Week of Delivery (1-20): ");
        int intWeekOfDelivery = input.nextInt();


    }
}