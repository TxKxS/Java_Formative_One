import java.util.Scanner;

public class delivery{

    public static void delivery(Scanner input) {

        float fltMass = 0;
        int intQualityScore = 0;
        int intWeekOfDelivery;
        String strProduceCoce;
        char chrGrade = 'Z';

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
        String strMemberName = input.nextLine();

        //Number Produce Code
        boolean bolCheck = false;
        do {
            System.out.print("Produce Code  (MZE/BNS/POT/TEA): ");
            strProduceCoce = input.next().toUpperCase();
            switch (strProduceCoce) {
                case "MZE":
                    bolCheck = true;
                    break;
                case "BNS":
                    bolCheck = true;
                    break;
                case "POT":
                    bolCheck = true;
                    break;
                case "TEA":
                    bolCheck = true;
                    break;
                default:
                    System.out.println("Invalid Product Code. Options are 'MZE', 'BNS', 'POT', 'TEA' ");
            }
        } while (!bolCheck);

        //Record Mass
        do {
            System.out.print("Mass (in Kg): ");
            try {
                fltMass = input.nextFloat();
                if (fltMass < 0) {
                    System.out.println("Mass cannot be negative. It needs to be greater than 0.");
                } else if (fltMass > 5000) {
                    System.out.println("Maximum mass is only 5000 (<5000).");
                }
            } catch (Exception e) {
                System.out.println("Please enter a 'number' between 0 and 5000.");
                input.next(); //Clearing up the buffer to remove the infite loop bug
                fltMass = -1;
            }
        } while (fltMass < 0 || fltMass > 5000);


        //Record Quality score
        do {
            System.out.print("Quality Score (0-100): ");
            try {
                intQualityScore = input.nextInt();
                if (intQualityScore < 0 || intQualityScore > 100) {
                    System.out.println("Invalid Quality Score. It needs to be between 0 and 100 (inclusive).");
                }
            } catch (Exception e) {
                System.out.println("Invalid Quality Score. Please enter an integer between 0 and 100 inclusive.");
                input.next(); //Clearing up the buffer to remove the infite loop bug
                intQualityScore = -1;
            }
            ;
        } while (intQualityScore < 0 || intQualityScore > 100);

        //Find Grade
        if (intQualityScore < 50) {
            chrGrade = 'X';
            System.out.println("Unexpected error. Invalid Quality Score. Grade has been assigned to 'Z'.");
        } else if (intQualityScore <= 69) {
            chrGrade = 'C';
        } else if (intQualityScore <= 84) {
            chrGrade = 'B';
        } else if (intQualityScore <= 100) {
            chrGrade = 'A';
        }

        //Record week of delivery
        do {
            try {
                System.out.print("Week of Delivery (1-20): ");
                intWeekOfDelivery = input.nextInt();
                if (intWeekOfDelivery < 1 || intWeekOfDelivery > 20) {
                    System.out.println("Invalid option. Please enter a number between 1 and 20.");
                }
            } catch (Exception e) {
                System.out.println("Invalid option. Please enter an integer between 1 and 20.");
                input.next(); //Clearing up the buffer
                intWeekOfDelivery = -1;
            }
        } while (intWeekOfDelivery < 1 || intWeekOfDelivery > 20);


        //Creating Object
        switch (strProduceCoce) {
            case "MZE":

                HarvestLog.deliveries.add(new maize(fltMass, chrGrade, strProduceCoce, "Cereal", intWeekOfDelivery));
                System.out.println("\nMaize harvest has been recorded.");
                break;

            case "BNS":

                HarvestLog.deliveries.add(new beans(fltMass, chrGrade, strProduceCoce, "Cereal", intWeekOfDelivery));
                System.out.println("\nBean harvest has been recorded.");
                break;

            case "POT":

                HarvestLog.deliveries.add(new potatoes(fltMass, chrGrade, strProduceCoce, "Perishable", intWeekOfDelivery));
                System.out.println("\nPotato harvest has been recorded.");
                break;

            case "TEA":

                HarvestLog.deliveries.add(new greenTea(fltMass, chrGrade, strProduceCoce, "Cash Crop", intWeekOfDelivery));
                System.out.println("\nGreen Tea harvest has been recorded.");
                break;
        }

        return;
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