abstract class crop{

    //abstract
    private float fltWeight = 0;
    private char chrGrade = 'Z';
    private String strProduceCode = "None";
    private String strCategory = "None";
    private int intDeliveryWeek = 0;

    public crop(float Weight, char Grade, String ProduceCode, String Category,  int intDeliveryWeek) {
            this.fltWeight = Weight;
            this.chrGrade = Grade;
            this.strProduceCode = ProduceCode;
            this.strCategory = Category;
            this.intDeliveryWeek = intDeliveryWeek;
    }

    public int getPrice(){return 0;}

    public char getGrade(){return this.chrGrade;}

    public String getProduceCode(){return this.strProduceCode;}

    public String getCategory(){return this.strCategory;}

    public  int getDeliveryWeek(){return this.intDeliveryWeek; }

}

class Maize extends crop{

    public  Maize(float Weight, char Grade, String ProduceCode, String Category, int intDeliveryWeek) {
            super(Weight,Grade, ProduceCode,Category, intDeliveryWeek);
    }

    @Override
    public int getPrice() {return  30;} // Rs30/Kg

}

class Beans extends crop {

    public Beans(float Weight, char Grade, String ProduceCode, String Category, int intDeliveryWeek) {
            super(Weight,Grade, ProduceCode,Category, intDeliveryWeek);
    }

    @Override
    public int getPrice() {return  90;} // Rs90/Kg

}

class Potatoes extends crop {

    private final int price = 45; // Rs45/Kg

    public Potatoes(float Weight, char Grade, String ProduceCode, String Category, int intDeliveryWeek) {
            super(Weight, Grade, ProduceCode, Category, intDeliveryWeek);
    }


    @Override
    public int getPrice() {return  45;} // Rs45/Kg

}

class GreenTea extends crop {

    private final int price = 25; // Rs25/Kg

    public  GreenTea(float Weight, char Grade, String ProduceCode, String Category, int intDeliveryWeek) {
            super(Weight,Grade, ProduceCode,Category, intDeliveryWeek);
    }

    @Override
    public int getPrice() {return  25;}
}

