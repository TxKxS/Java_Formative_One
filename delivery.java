import java.util.Scanner;

public class delivery{

    public static void delivery(Scanner input) {


        System.out.println("Record a Delivery");

        System.out.println("\nPlease enter the following details: ");


        System.out.print("Member Identifier: ");
        String strMemberId = input.next();

        while (!memberIDCheck(strMemberId)) {
            System.out.println("Invalid Member ID");
            System.out.print("Please enter correct Member Identifier: ");
            strMemberId = input.next();
        }

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

    public static boolean memberIDCheck(String MemberID) {

        boolean bolCheck = true;

        if  (MemberID.length() != 6) {
            System.out.println("Please enter a 6 digit member ID");
            bolCheck = false;
        }

        if (!MemberID.substring(0,2).equals("M-")) {
            System.out.println("Member ID need to start with an 'M-'. M followed by an '-'.");
            bolCheck = false;
        }

        try {

            int intMemberDigits =  Integer.parseInt(MemberID.substring(2));

            //System.out.println(intMemberDigits); //Check for debuging purposes

            if ((intMemberDigits < 0000 ) || (intMemberDigits > 9999)) {
                System.out.println("Last 4 characters need to be 4 digits.");
                bolCheck = false;
            }

        } catch (Exception e) {
            System.out.println("Last 4 characters need to be 4 digits.");
            bolCheck = false;
        }

        return bolCheck;

    }


}