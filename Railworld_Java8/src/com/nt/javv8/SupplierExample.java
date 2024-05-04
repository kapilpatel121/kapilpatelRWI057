package com.nt.javv8;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> {
            String otp = ""; 
            for (int i = 0; i < 6; i++) {
               otp= otp+((int) (Math.random() * 10));
            }
            return otp.toString();
        };

        String generatedOTP = supplier.get();
        System.out.println("Generated OTP: " + generatedOTP);
    }
}
