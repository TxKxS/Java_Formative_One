import java.util.ArrayList;
import java.util.Collections;

public class topFive{

    public static void display(){

        int index;

        //for simplification and code readability
        ArrayList<crop> deliveries = HarvestLog.deliveries;

        //Sort List in Desc
        Collections.sort(deliveries, (c1, c2) -> Double.compare(c2.getNetPayableAmount(), c1.getNetPayableAmount()));

        if (deliveries.size() !=0) {
            if (deliveries.size() > 5) {
                index = 5;
            } else {
                index = deliveries.size();
            }

            System.out.println("\nTop 5 deliveries by value:");
            System.out.println("Week    MZE     BNS     POT     TEA         Total");
            for (int i = 0; i < index; i++) {
                System.out.println((i + 1) + ". " + deliveries.get(i).getDeliveryID() + " " + deliveries.get(i).getMemberID() + " " + deliveries.get(i).getProduceCode() + " " + deliveries.get(i).getGrade() + " " + String.format("%.1f", deliveries.get(i).getWeight()) + "Kg   " + String.format("%2f", deliveries.get(i).getNetPayableAmount()));
            }
        } else {
            System.out.println("No deliveries yet");
        }
    }
}