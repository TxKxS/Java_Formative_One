public abstract class crop{

    //abstract
    private float fltWeight = 0;
    private char chrGrade = 'Z';
    private String strProduceCode = "None";
    private String strCategory = "None";
    private int intDeliveryWeek = 0;

    public crop(float Weight, char Grade, String ProduceCode, String Category,  int intDeliveryWeek) {
            this.fltWeight = Weight;
            this.chrGrade = Grade;
            this.strProduceCode = ProduceCode;
            this.strCategory = Category;
            this.intDeliveryWeek = intDeliveryWeek;
    }

    public int getPrice(){return 0;}

    public char getGrade(){return this.chrGrade;}

    public float getWeight(){ return this.fltWeight; }

    public String getProduceCode(){return this.strProduceCode;}

    public String getCategory(){return this.strCategory;}

    public  int getDeliveryWeek(){return this.intDeliveryWeek; }

}
