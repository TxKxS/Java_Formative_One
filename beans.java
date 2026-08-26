public class beans extends crop {

    public beans(float Weight, char Grade, String ProduceCode, String Category, int intDeliveryWeek) {
        super(Weight,Grade, ProduceCode,Category, intDeliveryWeek);
    }

    @Override
    public int getPrice() {return  90;} // Rs90/Kg

}