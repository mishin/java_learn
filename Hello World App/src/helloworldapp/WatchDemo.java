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
public class WatchDemo {
      public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        Watch watch1 = new Watch();
        Watch watch2 = new Watch();

        // Invoke methods on 
        // those objects
        watch1.setBrand("Orel");
        watch1.incTime(100);
        watch1.decTime(30);
        watch1.printStates();

        watch2.setBrand("Sky");
        watch2.incTime(10);
        watch2.decTime(2);
        watch2.decTime(40);       
        watch2.printStates();
    }
}
