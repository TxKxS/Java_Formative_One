import java.util.ArrayList;


public class UpdateMemberList {

    public static void updateMemberList(int index) {

        ArrayList<crop> deliveries = HarvestLog.deliveries;

        String strPaymentMemberID = deliveries.get(index).getMemberID();

        boolean bFound = false;

        //if MemberList not empty,  find if member exist in it
        if (memberList.memberList.size() != 0 ) {

            for (member objMember : memberList.memberList) {

                // if the member is found, add the total to the existing total of the member
                if (objMember.getMemberID().equals(strPaymentMemberID)) {
                    objMember.setNewTotal(deliveries.get(index).getNetPayableAmount());
                    bFound = true;
                    break;
                }

            }
            //if member is not found, add the new memberid to member
            if (!bFound) {
                memberList.memberList.add(new member(deliveries.get(index).getMemberID() ,deliveries.get(index).getMemberName(), deliveries.get(index).getNetPayableAmount() ));
                return;
            } else {return;}

        } else { //if empty just append directly
            memberList.memberList.add(new member(deliveries.get(index).getMemberID() ,deliveries.get(index).getMemberName(), deliveries.get(index).getNetPayableAmount() ));
            return;
        }


    }

}