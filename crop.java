public abstract class crop{

    //abstract
    private float fltWeight = 0;
    private char chrGrade = 'Z';
    private String strProduceCode = "None";
    private String strCategory = "None";
    private float fltPrice = 0;
    private int intDeliveryWeek = 0;

    public class crop(float Weight, char Grade, String ProduceCode, String Category,  int intDeliveryWeek) {
            this.fltWeight = Weight;
            this.chrGrade = Grade;
            this.strProduceCode = ProduceCode;
            this.strCategory = Category;
            this.intDeliveryWeek = intDeliveryWeek;
    }



    public static int getPrice(){
        return this.fltPrice;
    }

    public char getGrade(){
        return this.chrGrade;
    }

    public String getProduceCode(){
        return this.stProduceCode;
    }

    public String getCategory(){
        return this.strCategory;
    }

}

public class Maize extends crop{

    private final int price = 30; // Rs30/Kg

    public class Maize(float Weight, char Grade, String ProduceCode, String Category, int intDeliveryWeek) {
            super(Weight,Grade, ProduceCode,Category, intDeliveryWeek)
    }

}

public class Beans extends crop {

    private final int price = 90; // Rs90/Kg

    public class Beans(float Weight, char Grade, String ProduceCode, String Category, int intDeliveryWeek) {
            super(Weight,Grade, ProduceCode,Category, intDeliveryWeek)
    }

}

public class Potatoes extends crop {

    private final int price = 45; // Rs45/Kg

    public class Potatoes(float Weight, char Grade, String ProduceCode, String Category, int intDeliveryWeek) {
            super(Weight,Grade, ProduceCode,Category, intDeliveryWeek)
    }


}

public class GreenTea extends crop {

    private final int price = 25; // Rs25/Kg

    public class GreenTea(float Weight, char Grade, String ProduceCode, String Category, int intDeliveryWeek) {
            super(Weight,Grade, ProduceCode,Category, intDeliveryWeek)
    }

}

