package com.example.exercise;

public class Calculator {


    public static Float getResult(Float val1, Float val2, String sign) {

        Float result = null;

        if (sign.equals("/")) {
            result =  val1 / val2;
        } else if (sign.equals("*")) {
            result = val1 * val2;
        } else if (sign.equals("+")) {
            result = val1 + val2;
        } else if (sign.equals("-")) {
            result = val1 - val2;
        }

        return result;
    }
}
