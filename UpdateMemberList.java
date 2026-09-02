import java.util.ArrayList;


public UpdateMemberList.java() {



    public static void updateMemberList(int index) {

        ArrayList<crop> deliveries = HarvestLog.deliveries;

        String strPaymentMemberID = deliveries.get(index).getMemberID;

        boolean bFound = false;

        //if MemberList not empty,  find if member exist in it
        if (MemberList.memberList.size != 0 ) {

            for (member in memberList) {

                // if the member is found, add the total to the existing total of the member
                if (member.getMemberID == strPaymentMemberID) {
                    member.setNewTotal(deliveries.get(index).getNetPayableAmount());
                    bFound = true;
                    break;
                }

            }
            //if member is not found, add the new memberid to member
            if (!bFound) {
                MemberList.memberList.add(new member(deliveries.get(index).getMemberId() ,deliveries.get(index).getMemberName(), deliveries.get(index).getNetPayableAmount() ));
            }

        } else { //if empty just append directly
            MemberList.memberList.add(new member(deliveries.get(index).getMemberId() ,deliveries.get(index).getMemberName(), deliveries.get(index).getNetPayableAmount() ));
        }


    }

}