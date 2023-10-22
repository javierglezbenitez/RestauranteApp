package org.ulpgc.is1.model;

import java.util.regex.Pattern;

public class Phone {
    private String number;

    public Phone(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isValid() {
        String patron = "^(\\+\\d{1,2})?[-.\\s]?\\(?\\d{1,4}\\)?[-.\\s]?\\d{1,9}$";

        if (this.number.length() != 9){
            return false;
        }else
            return Pattern.compile(patron).matcher(this.number).matches();

    }


    @Override
    public String toString() {
        if (isValid()) {
            return number;
        } else {
            return "XXXX";
        }
    }
}
