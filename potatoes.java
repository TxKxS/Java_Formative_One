public class potatoes extends crop {

    public potatoes(float Weight, char Grade, String ProduceCode, String Category, int intDeliveryWeek) {
        super(Weight, Grade, ProduceCode, Category, intDeliveryWeek);
    }


    @Override
    public int getPrice() {return  45;} // Rs45/Kg

}