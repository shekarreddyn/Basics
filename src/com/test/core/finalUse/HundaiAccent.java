package com.test.core.finalUse;

public class HundaiAccent extends FinalTest1{

    static {
        System.out.println("The fuel helps in starting of the engine");
        System.out.println("The car as been started");
    }

    public static void main(String[] args) {


        HundaiAccent accent = new HundaiAccent();
        accent.gearSystem(args[0]);
        accent.musicSystem();
        System.out.println("Possibility of applyig the breaks");
        accent.breakingSystem();
        accent.gearSystem(args[0]);
        accent.gearSystem(args[1]);
        accent.breakingSystem();
        accent.gearSystem(args[0]);
        accent.gearSystem(args[1]);
        accent.gearSystem(args[2]);
        accent.abs();
    }


    @Override
    public void abs() {
        System.out.println("it has abs");
    }

    @Override
    public void rearCamera() {
        System.out.println("The rear camera is not available");

    }

    @Override
    public void breakingSystem() {

        System.out.println("perfect breaking system");
    }

    @Override
    public void musicSystem() {
        System.out.println("comes with inbuilt music system");
    }

    @Override
    public void gearSystem(String gearNum) {

        System.out.println("Car is in "+gearNum+" gear");
    }



}
