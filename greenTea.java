public class greenTea extends crop {

    private final int price = 25; // Rs25/Kg

    public  greenTea(float Weight, char Grade, String ProduceCode, String Category, int intDeliveryWeek) {
        super(Weight,Grade, ProduceCode,Category, intDeliveryWeek);
    }

    @Override
    public int getPrice() {return  25;}
}