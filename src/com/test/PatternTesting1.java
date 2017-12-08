

package com.test;

/*

  *
  ++
  $$$
  ****
  +++++
  $$$$$$

*/


public class PatternTesting1 {

    public static void main(String[] args) {


        for(int i=0; i<6; i++) {


            for (int j=0; j<=i; j++) {
                if(i==0 || i==3) {
                    System.out.print("*");
                }
                if(i==1 || i==4) {
                    System.out.print("+");
                }
                else if(i==2 || i==5) {
                    System.out.print("$");
                }
            }
            System.out.println();
        }
    }

}
