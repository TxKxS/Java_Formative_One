public class maize extends crop{

    public  maize(float Weight, char Grade, String ProduceCode, String Category, int intDeliveryWeek) {
        super(Weight,Grade, ProduceCode,Category, intDeliveryWeek);
    }

    @Override
    public int getPrice() {return  30;} // Rs30/Kg

}