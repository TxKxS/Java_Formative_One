import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SeasonReport {
    public static void writeToFile() {
        // file is saved in the current working directory
        String fileName = "report.txt";

        ArrayList<crop> copyOfDeliveries = new ArrayList<>(HarvestLog.deliveries);


        //error catching
        try (PrintWriter out = new PrintWriter(new FileWriter(fileName))) {

            out.println("REKOLT PRODUCE TRACKER");
            out.println();
            out.println("Member Report:");


            // Write each member
            for (member m : memberList.memberList) {
                out.println(m.getMemberID() + "   " + m.getMemberName() + "   " + m.getTotal());
                out.println("List of Deliveries:");
                for (int i = 0; i < copyOfDeliveries.size(); i++) {
                    if (m.getMemberID().equals(copyOfDeliveries.get(i).getMemberID())) {
                        out.println(copyOfDeliveries.get(i).getDeliveryID() + " - " + copyOfDeliveries.get(i).getNetPayableAmount());
                        copyOfDeliveries.remove(i);
                    }
                }
            }

            out.println();
            out.println("Summary");
            out.println("Weekly Volume Grid:");

            // Write the matrix
            double[][] matrix = new double[20][5];
            int i, j = 0 , maxRow = 0;

            for (crop c : HarvestLog.deliveries) {
                i = c.getDeliveryWeek() - 1; // Oth indexing so all numbers is always 1 less
                switch (c.getProduceCode()) {
                    case "MZE":
                        j = 0;
                        break;

                    case "BNS":
                        j = 1;
                        break;

                    case "POT":
                        j = 2;
                        break;

                    case "TEA":
                        j = 3;
                        break;
                }
                matrix[i][j] += c.getNetPayableAmount(); //Individual element
                matrix[i][4] += c.getNetPayableAmount(); //total of the row

                if (i > maxRow) { maxRow = i; } //Finding maximum row to not print the whole matrix is the end is empty

            }

            //Printing the array
            out.println("\nWeek    MZE     BNS     POT     TEA         TOTAL ");
            for (i = 0; i <= maxRow; i++) { //printing until max row
                out.print("\n" + (i +1) + "      ");
                for (j = 0; j < 5; j++) {
                    out.print(String.format("%.2f",matrix[i][j]) + "       ");
                }
            }

            System.out.println("Report written to " + fileName);


        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
