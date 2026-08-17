public class crop{

    //interface

    private float fltWeight = 0;
    private char chrGrade = 'Z';
    private String strProduceCode = "None";
    private String strCategory = "None";
    private float fltPrice = 0;

    public static int getPrice(){
        return this.fltPrice;
    }

    public static char getGrade(){
        return this.chrGrade;
    }

    public static String getProduceCode(){
        return this.stProduceCode;
    }

    public static String getCategory(){
        return this.strCategory;
    }

}

public class Maize extends crop{

    private final int price = 30 // Rs30/Kg

    public class Maize(float Weight, char Grade, String ProduceCode, String Category) {
            this.fltWeight = Weight;
            this.chrGrade = Grade;
            this.strProduceCode = ProduceCode;
            this.strCategory = Category;
    }

}

public class Beans extends crop {

    private final int price = 90 // Rs90/Kg

    public class Beans(float Weight, char Grade, String ProduceCode, String Category) {
            this.fltWeight = Weight;
            this.chrGrade = Grade;
            this.strProduceCode = ProduceCode;
            this.strCategory = Category;
    }


}

public class Potatoes extends crop {

    private final int price = 45 // Rs45/Kg

    public class potatoes(float Weight, char Grade, String ProduceCode, String Category) {
            this.fltWeight = Weight;
            this.chrGrade = Grade;
            this.strProduceCode = ProduceCode;
            this.strCategory = Category;
    }


}

public class GreenTea extends crop {

    private final int price = 25 // Rs25/Kg

    public class GreenTea(float Weight, char Grade, String ProduceCode, String Category) {
            this.fltWeight = Weight;
            this.chrGrade = Grade;
            this.strProduceCode = ProduceCode;
            this.strCategory = Category;
    }


}

