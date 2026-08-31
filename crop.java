public abstract class crop{

    //Autoincrementing ID
    private static int nextId = 0;

    //abstract
    String strDeliveryID;
    private float fltWeight = 0;
    private char chrGrade = 'Z';
    private String strProduceCode = "None";
    private String strCategory = "None";
    private int intDeliveryWeek = 0;

    public crop(float Weight, char Grade, String ProduceCode, String Category,  int intDeliveryWeek) {
            nextId++;
            this.strDeliveryID = getDeliveryId();

            this.fltWeight = Weight;
            this.chrGrade = Grade;
            this.strProduceCode = ProduceCode;
            this.strCategory = Category;
            this.intDeliveryWeek = intDeliveryWeek;
    }

    public String getDeliveryId() {

        strDeliveryID = Integer.toString(this.nextId); //converts to string

        //adds 0s at the wrong to make it 4 digits
        while (strDeliveryID.length() < 4) {
            strDeliveryID = "0" + strDeliveryID;
        }
        //Adding 'D-' for commot Delivery ID format
        strDeliveryID = "D-"  + strDeliveryID;

        return strDeliveryID;
    }

    public int getPrice(){return 0;}

    public char getGrade(){return this.chrGrade;}

    public float getWeight(){ return this.fltWeight; }

    public String getProduceCode(){return this.strProduceCode;}

    public String getCategory(){return this.strCategory;}

    public  int getDeliveryWeek(){return this.intDeliveryWeek; }

}
