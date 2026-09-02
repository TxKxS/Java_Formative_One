import java.util.Collections;

public class TotalPerMember {

    public static void display() {

        //Sort List in Desc
        Collections.sort(memberList.memberList, (m1, m2) -> Double.compare(m2.getTotal(), m1.getTotal()));

        // Outputing the list
        System.out.println("Total payment per member (MUR)\n");
        for (member m : memberList.memberList) {
            System.out.println(m.getMemberID() + " - " + m.getMemberName() +" - " + String.format("%.2f",m.getTotal()));
        }
    }
}