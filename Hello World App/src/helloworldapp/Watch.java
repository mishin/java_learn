/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author ira
 */
public class Watch {
    String brand = "Orient";
    int time = 0;

    void setBrand(String newValue) {
         brand = newValue;
    }
    
    void changeTime(int newValue) {
         time = newValue;
    }

    void incTime(int increment) {
         time = time + increment;   
    }

    void decTime(int decrement) {
         time = time - decrement;
    }

    void printStates() {
         System.out.println("brand:" +
             brand + " time:" + 
             time );
    }
}
