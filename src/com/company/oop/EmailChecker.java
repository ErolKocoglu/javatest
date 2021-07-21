package com.company.oop;

public class EmailChecker {
    public boolean isValid(String email) {
        boolean valid;
        boolean hasAtSymbol = email.contains("@");
        boolean beforeAtEmpty = email.substring(0, email.indexOf("@")).isEmpty();
        boolean pointAfterAt=email.substring(email.indexOf("@")).contains(".");
        boolean betweenAtAndPointEmpty=false;
        if(pointAfterAt){
            betweenAtAndPointEmpty=email.substring(email.indexOf("@"), email.indexOf(".")).isEmpty();
        }

        boolean afterPointEmpty=false;
        if(pointAfterAt){
            afterPointEmpty=email.substring(email.indexOf(".")).isEmpty();
        }
        int countOfPointAfterAt=0;
        if(pointAfterAt){
            countOfPointAfterAt=email.substring(email.indexOf("@")).split(".").length+1;
        }


        if (hasAtSymbol && !beforeAtEmpty && pointAfterAt && !betweenAtAndPointEmpty && !afterPointEmpty) {
            if(countOfPointAfterAt==1){
                valid=true;
            }else{
                boolean betweenTwoPointEmpty=email.substring(email.indexOf("."), email.indexOf(".", email.indexOf(".") )).isEmpty();
                if(!betweenTwoPointEmpty){
                    valid=true;
                }else{
                    valid=false;
                }
            }

        } else{
            valid=false;
        }
        return valid;
    }
}
