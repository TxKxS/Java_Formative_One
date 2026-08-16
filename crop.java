public class crop{

    private float fltWeight = 0;
    private char chrGrade = 'Z';
    private String strProduceCode = "None";
    private String strCategory = "None";

}

public class Maize extends crop{

    public class Maize(float Weight, char Grade, String ProduceCode, String Category) {
            this.fltWeight = Weight;
            this.chrGrade = Grade;
            this.strProduceCode = ProduceCode;
            this.strCategory = Category;
    }

}

public class Beans extends crop {

    public class Beans(float Weight, char Grade, String ProduceCode, String Category) {
            this.fltWeight = Weight;
            this.chrGrade = Grade;
            this.strProduceCode = ProduceCode;
            this.strCategory = Category;
    }


}

public class Potatoes extends crop {

    public class potatoes(float Weight, char Grade, String ProduceCode, String Category) {
            this.fltWeight = Weight;
            this.chrGrade = Grade;
            this.strProduceCode = ProduceCode;
            this.strCategory = Category;
    }


}

public class GreenTea extends crop {

    public class GreenTea(float Weight, char Grade, String ProduceCode, String Category) {
            this.fltWeight = Weight;
            this.chrGrade = Grade;
            this.strProduceCode = ProduceCode;
            this.strCategory = Category;
    }


}

