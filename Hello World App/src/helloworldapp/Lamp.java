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

public class Lamp {

    String MySwitch  = "off";

    void changeMySwitch(String newValue) {
         MySwitch = newValue;
    }

    void printStates() {
         System.out.println("MySwitch: " +  MySwitch );
    }
}