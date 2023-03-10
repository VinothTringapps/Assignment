package org.example;

import java.util.logging.*;
//" 3. Design a class for a basic credit card. The class should have the following features:
//    - Instance variables for the cardholder's name, card number, and expiration date.
//  - A constructor that allows the user to create a credit card with a given name, card number, and
//  expiration date.
//- An equals method that returns true if the given object is a credit card with the same card number, and
// false otherwise.
// - A clone method that creates and returns a new credit card with the same name, card number,
//        and expiration date as the original credit card."
public class BasicCreditCard implements Cloneable {
    String cardHolderName;
    String cardNumber;
    String expiryDate;
    Logger l=Logger.getLogger("BasicCreditCard");
    BasicCreditCard(String name,String cardNumber,String expiryDate){
        this.cardHolderName=name;
        this.cardNumber=cardNumber;
        this.expiryDate=expiryDate;
    }
    public boolean checkEqual(BasicCreditCard verify){
        return this.cardNumber.equalsIgnoreCase(verify.cardNumber);
    }


    public Object clone() {
        try {
            return super.clone();
        }
        catch(CloneNotSupportedException e){
            l.info("Clone is Not Done");
            return this;
        }

    }
}