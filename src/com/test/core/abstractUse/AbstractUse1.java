package com.test.core.abstractUse;

public class AbstractUse1 extends AbstractTest1{

    @Override
    public void play() {

    }


    public static void main(String[] a){


        AbstractTest1 abstractTest1 = new AbstractUse1();
        abstractTest1.cook();
        abstractTest1.play();
    }


}
