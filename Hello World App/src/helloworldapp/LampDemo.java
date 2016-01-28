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
class LampDemo {

    public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        Lamp lamp1 = new Lamp();
        Lamp lamp2 = new Lamp();

        // Invoke methods on 
        // those objects
        lamp1.changeMySwitch("off");
        lamp2.changeMySwitch("off");
        lamp1.printStates();
        lamp2.printStates();

        lamp1.changeMySwitch("on");
        lamp2.changeMySwitch("on");
        lamp1.printStates();
        lamp2.printStates();

    }
}
