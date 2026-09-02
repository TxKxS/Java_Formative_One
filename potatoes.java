public class potatoes extends crop {

    public potatoes(String strMemberID, String strMemberName ,float Weight, char Grade, String ProduceCode, String Category,  int intDeliveryWeek) {
        super(strMemberID, strMemberName, Weight, Grade, ProduceCode, Category, intDeliveryWeek);
    }

    @Override
    public int getPrice() {return  45;} // Rs45/Kg

}