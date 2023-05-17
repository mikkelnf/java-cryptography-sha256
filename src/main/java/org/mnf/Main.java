package org.mnf;

import java.security.MessageDigest;

public class Main {
    public static void main(String[] args) {
//        String ade = "ade";
//        StringBuffer ade2 = new StringBuffer("ade2");
//        ade2.append(9999);
//        StringBuilder ade3 = new StringBuilder("ade3");
//        ade3.append('x');
//        ade3.append(false);
//        System.out.println("Hello world!");
//        System.out.println(ade2);
//        System.out.println(ade3);
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            String text = "HelloWorld";
            md.update(text.getBytes());
            byte[] digested = md.digest();
            System.out.println(digested);

            StringBuffer hexString = new StringBuffer();
            for(int x : digested){
                hexString.append(Integer.toHexString(0XFF & x));
            }
            System.out.println(hexString);
        }catch (Exception e){

        }
    }
}