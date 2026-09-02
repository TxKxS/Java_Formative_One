public class greenTea extends crop {

    public  greenTea(String strMemberID, String strMemberName ,float Weight, char Grade, String ProduceCode, String Category,  int intDeliveryWeek) {
        super(strMemberID, strMemberName,Weight,Grade, ProduceCode,Category, intDeliveryWeek);
    }

    @Override
    public int getPrice() {return  25;} //Rs25/Kg
}