public class beans extends crop {

    public beans(String strMemberID, String strMemberName ,float Weight, char Grade, String ProduceCode, String Category,  int intDeliveryWeek) {
        super(strMemberID, strMemberName, Weight, Grade, ProduceCode, Category, intDeliveryWeek);
    }

    @Override
    public int getPrice() {return  90;} // Rs90/Kg

}