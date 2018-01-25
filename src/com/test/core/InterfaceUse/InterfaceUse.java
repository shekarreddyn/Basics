package com.test.core.InterfaceUse;

public class InterfaceUse {

    public static void main(String[] a) {


        Nokia1110 nokia1110 = new Nokia1110();

        nokia1110.messaging();
        nokia1110.callServices();
        nokia1110.gaming();
        nokia1110.paidServices();
        nokia1110.settings();

        System.out.println(NokiaInterface.manufacturingCompany);
    }
}
