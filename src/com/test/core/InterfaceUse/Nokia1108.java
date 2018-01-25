package com.test.core.InterfaceUse;

public class Nokia1108 implements NokiaInterface{

    @Override
    public void messaging() {

        System.out.println("I do it with 120 characters");
    }

    @Override
    public void gaming() {

        System.out.println("I do have snake game");

    }

    @Override
    public void paidServices() {

        System.out.println("dependent on SIM card");

    }

    @Override
    public void profiles() {

        System.out.println("All the standard profiles I do support");
    }

    @Override
    public void callServices() {

        System.out.println("Same as others");

    }

    @Override
    public void settings() {

    }
}
