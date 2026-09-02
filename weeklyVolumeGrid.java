public class weeklyVolumeGrid {

    public static void display() {

        //2D array of 20 rows and 5 colums
        //colums are MZE, BNS, POT, TEA & Total
        double[][] matrix = new double[20][5];
        int i, j = 0 , maxRow = 0;

        for (crop c : HarvestLog.deliveries) {
            i = c.getDeliveryWeek() - 1; // Oth indexing so all numbers is always 2 less
            switch (c.getCategory()) {
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
            matrix[i][j] += c.getNetPayableAmount(); //Single element in the matrix
            matrix[i][4] += c.getNetPayableAmount(); //total of the row

            if (i > maxRow) { maxRow = i; } //Finding maximum row to not print the whole matrix is the end is empty

        }

        //Printing the array
        System.out.println("\nWeek    MZE     BNS     POT     TEA         TOTAL ");
        for (i = 0; i <= maxRow; i++) { //printing until max row
            System.out.print("\n" + (i +1) + "      ");
            for (j = 0; j < 5; j++) {
                System.out.print(String.format("%.2f",matrix[i][j]) + "       ");
            }
        }
    }
}