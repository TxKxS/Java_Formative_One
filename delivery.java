import java.util.Scanner;

public class delivery{

    public static void delivery(Scanner input) {

        float fltMass = 0;


        System.out.println("Record a Delivery");

        System.out.println("\nPlease enter the following details: ");

        //Record Member ID
        System.out.print("Member Identifier: ");
        String strMemberId = input.next();

        while (!memberIDCheck(strMemberId)) {
            System.out.println("Invalid Member ID");
            System.out.print("Please enter correct Member Identifier: ");
            strMemberId = input.next();
        }


        // Record Member Name
        System.out.print("Member Name: ");
        String strMemberName = input.next();

        //Number Produce Code
        System.out.print("Produce Code: ");
        String strProduceCoce = input.next();

        //Record Mass
        do {
            System.out.print("Mass (in Kg): ");
            fltMass = input.nextFloat();
            if (fltMass < 0) {
                System.out.println("Mass cannot be negative. It needs to be greater than 0.");
            } else if (fltMass > 5000) {
                System.out.println("Maximum mass is only 5000.");
            }
        } while (fltMass < 0 || fltMass > 5000);


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
                System.out.println("Last 4 characters need to be 4 digits. Negative numbers not allowed");
                bolCheck = false;
            }

        } catch (Exception e) {
            System.out.println("Last 4 characters need to be 4 digits.");
            bolCheck = false;
        }

        return bolCheck;

    }


}