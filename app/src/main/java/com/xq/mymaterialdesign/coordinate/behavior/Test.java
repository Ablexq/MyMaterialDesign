package com.xq.mymaterialdesign.coordinate.behavior;

import java.math.BigDecimal;
import java.text.DecimalFormat;



public class Test {

    public static void main(String[] args) {
        Double num = -99.0694;
        System.out.println(new DecimalFormat("0.00").format(num));


        BigDecimal decimal = new BigDecimal("-99.0694");
        BigDecimal setScale1 = decimal.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(setScale1);
    }

}
