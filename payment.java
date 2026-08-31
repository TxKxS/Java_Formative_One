import java.util.ArrayList;

public class payment {

    public static void payment() {
        ArrayList<crop> deliveries = HarvestLog.deliveries;

        if (deliveries.isEmpty()) {
            System.out.println("No deliveries recorded yet.");
            return;
        }

        int index = deliveries.size() - 1;

        float fltMass = deliveries.get(index).getWeight();
        char chrGrade = deliveries.get(index).getGrade();
        int intPrice = deliveries.get(index).getPrice();
        String strCategory = deliveries.get(index).getCategory();

        // Convert char grade to enum
        Grade enumGrade = Grade.fromChar(chrGrade);

        // Step 1: base value = weight × price per kg
        double dbBaseValue = fltMass * intPrice;


        // Category multiplier
        float fltCategoryMultiplier;
        String categoryName;

        // Category Switching for multiplier
        switch (strCategory) {
            case "Cereal":
                fltCategoryMultiplier = 1.00;
                categoryName = "Cereal";
                break;
            case "Perishable":
                fltCategoryMultiplier = 0.90;
                categoryName = "Perishable";
                break;
            case "Cash Crop":
                fltCategoryMultiplier = 1.10;
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
        double dbAfterCategory = dbAfterGrade * categoryMultiplier;

        // Step 4: commission (5%)
        double dbCommission = dbAfterCategory * 0.05;

        // Step 5: transport fee (2 per kg)
        double dbTransportFee = fltMass * 2;

        // Net payable
        double dbNetPayable = dbAfterCategory - dbCommission - dbTransportFee;






    }

    //Enum Grade
    public enum Grade {
        A("A", 1.15),
        B("B", 1.00),
        C("C", 0.85),
        REJECT("REJECT", 0.00);

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
            return 'X';
        }
    }
}
