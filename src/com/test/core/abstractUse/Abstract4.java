package com.test.core.abstractUse;

public class Abstract4 extends Abstract3 {
    public static void main(String[] args) {

        Abstract2 abstract2 = new Abstract4();
        abstract2.m3();
    }
        @Override
        public void m1 () {

        }

        @Override
        public void m2 () {

        }

        @Override
        public void m4 () {

        }

        @Override
        public void m5 () {

        }

        public void m3(){
            System.out.println("this is child class m3 version");

        }

}
