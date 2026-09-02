public class maize extends crop{

    public  maize(String strMemberID, String strMemberName ,float Weight, char Grade, String ProduceCode, String Category,  int intDeliveryWeek){
        super(strMemberID, strMemberName, Weight, Grade, ProduceCode, Category, intDeliveryWeek);
    }

    @Override
    public int getPrice() {return  30;} // Rs30/Kg

}