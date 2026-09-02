public class member {

    private String strMemberID;
    private String strMemberName;
    private double dbTotal = 0;

    public  member(String strMemberID, String strMemberName,  double dbTotal) {
        this.strMemberID = strMemberID;
        this.strMemberName = strMemberName;
        this.dbTotal = dbTotal;
    }

    public String getMemberID() {
        return this.strMemberID;
    }

    public String getMemberName() {
        return this.strMemberName;
    }

    public double setNewTotal(double dbAmount) {

        this.dbTotal+= dbAmount;
    }

}