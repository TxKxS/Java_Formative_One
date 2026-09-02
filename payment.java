import java.util.ArrayList;

public class payment {

    public static void payment() {

        //Incase of bugs and trying to access payment whichout any deliveries present or delivery not correctly recorded
        if (deliveries.isEmpty()) {
            System.out.println("No deliveries recorded yet.");
            return;
        }

        int index = deliveries.size() - 1;

        double dbMass = deliveries.get(index).getWeight();
        char chrGrade = deliveries.get(index).getGrade();
        int intPrice = deliveries.get(index).getPrice();
        String strCategory = deliveries.get(index).getCategory();
        double dbNetPayable; //Net Payable amount

        // Convert char grade to enum
        Grade enumGrade = Grade.fromChar(chrGrade);

        //As long it has not been rejected
        if (chrGrade != 'X') {

            // Step 1: base value = weight × price per kg
            double dbBaseValue = dbMass * intPrice;


            // Category multiplier
            double dbCategoryMultiplier;
            String categoryName;

            // Category Switching for multiplier
            switch (strCategory) {
                case "Cereal":
                    dbCategoryMultiplier = 1.00;
                    categoryName = "Cereal";
                    break;
                case "Perishable":
                    dbCategoryMultiplier = 0.90;
                    categoryName = "Perishable";
                    break;
                case "Cash Crop":
                    dbCategoryMultiplier = 1.10;
                    categoryName = "Cash Crop";
                    break;
                default:
                    System.out.println("Invalid category " + strCategory);
                    System.out.print("Please delivery details again. ");

                    return;
            }

            // Step 2: after grade
            double dbAfterGrade = dbBaseValue * enumGrade.getMultiplier();

            // Step 3: after category
            double dbAfterCategory = dbAfterGrade * dbCategoryMultiplier;

            // Step 4: commission (5%)
            double dbCommission = dbAfterCategory * 0.05;

            // Step 5: transport fee (2 per kg)
            double dbTransportFee = dbMass * 2;

            // Net payable
            dbNetPayable = dbAfterCategory - dbCommission - dbTransportFee;


            //Display
            System.out.println("Base value        " + dbMass + " x " + intPrice + "        =     " + String.format("%.2f",dbBaseValue));
            System.out.println("Grade " + enumGrade.getName() + "                   x " + enumGrade.getMultiplier() + "     =     " + String.format("%.2f",dbAfterGrade));
            System.out.println(categoryName + "                 x " + dbCategoryMultiplier + "     =     " + String.format("%.2f",dbAfterCategory));
            System.out.println("Commission 5%                        -      " + String.format("%.2f",dbCommission));
            System.out.println("Transport levy    " + dbMass + " x " + 2.0 + "        -      " + String.format("%.2f",dbTransportFee));
            System.out.println("NET PAYABLE                          =     " + String.format("%.2f",dbNetPayable) + " MUR");

        } else {
            System.out.println("Grase is too low. Payment has been rejected.");
            dbNetPayable = 0.00 ;
            //Assuming no fees being collected for transport when quality is too low
        }

        HarvestLog.deliveries.get(index).setNetPayableAmount(dbNetPayable);

        UpdateMemberList.updateMemberList(index);


        return;

    }

    //Enum Grade
    public enum Grade {
        A("A", 1.15),
        B("B", 1.00),
        C("C", 0.85),
        REJECT("X", 0.00);

        private final String name;
        private final double multiplier;

        Grade(String name, double multiplier) {
            this.name = name;
            this.multiplier = multiplier;
        }

        public String getName() {
            return name;
        }

        public double getMultiplier() {
            return multiplier;
        }

        // Convert a char grade to the enum
        public static Grade fromChar(char grade) {
            if (grade == 'A') return A;
            if (grade == 'B') return B;
            if (grade == 'C') return C;
            return REJECT;
        }
    }
}
