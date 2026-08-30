public class payment {


        public static void payment(){

                if (deliveries.isEmpty()) {
                        //Check if empty or not
                        System.out.println("No deliveries recorded yet.");
                        return;
                }

                // latest delivery
                index = deliveries.size() - 1;

                float fltMass = deliveries.get(index).getWeight();
                char chrGrade = deliveries.get(index).getGrade();
                int intPrice = deliveries.get(index).getPrice();
                String strProduceCode = deliveries.get(index).getProduceCode();
                String strCategory = deliveries.get(index).getCategory();
                Grade enumGrade = new Grade(deliveries.get(index).getGrade);

                // base price per kg * weight
                System.out.print("\nBase Value " + fltMass +  " x " + intPrice " :");
                double baseValue = fltMass * intPrice;









        }

        // --- nested Grade enum ---
        public enum Grade {
                A("A", 1.15),
                B("B", 1.00),
                C("C", 0.85),
                X("X", 0.00);

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

                public static Grade(chr grade) {
                        if (grade == 'A') return A;
                        if (grade == 'B') return B;
                        if (score == 'C') return C;
                        return REJECT;
                }
        }


}