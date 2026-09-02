public abstract class crop{

    //Autoincrementing ID
    private static int nextId = 0;

    //abstract
    private String strDeliveryID = "";
    private String strMemberID;
    private String strMemberName;
    private float fltWeight = 0;
    private char chrGrade = 'Z';
    private String strProduceCode = "None";
    private String strCategory = "None";
    private int intDeliveryWeek = 0;
    private double dbNetPayableAmount = 0.0;

    public crop(String MemberID, String MemberName ,float Weight, char Grade, String ProduceCode, String Category,  int DeliveryWeek) {
            nextId++;
            this.strDeliveryID = createDeliveryID();
            this.strMemberID = MemberID;
            this.strMemberName = MemberName;
            this.fltWeight = Weight;
            this.chrGrade = Grade;
            this.strProduceCode = ProduceCode;
            this.strCategory = Category;
            this.intDeliveryWeek = DeliveryWeek;
    }

    public String createDeliveryID() {

        strDeliveryID = Integer.toString(nextId); //converts to string

        //adds 0s at the wrong to make it 4 digits
        while (strDeliveryID.length() < 4) {
            strDeliveryID = "0" + strDeliveryID;
        }
        //Adding 'D-' for commot Delivery ID format
        strDeliveryID = "D-"  + strDeliveryID;

        return strDeliveryID;
    }

    public String getDeliveryID() {
        return strDeliveryID;
    }

    public String getMemberID() {return this.strMemberID;}

    public String getMemberName() {return this.strMemberName;}

    public int getPrice(){return 0;}

    public char getGrade(){return this.chrGrade;}

    public float getWeight(){ return this.fltWeight;}

    public String getProduceCode(){return this.strProduceCode;}

    public String getCategory(){return this.strCategory;}

    public  int getDeliveryWeek(){return this.intDeliveryWeek;}

    public void setNetPayableAmount(double NetPayableAmount){
        this.dbNetPayableAmount = NetPayableAmount;
        return;
    }
    public double getNetPayableAmount(){return this.dbNetPayableAmount; }

}
