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
class GoodWatch implements WatchInterface {

    String brand = "Orient";
    int time = 0;

    public void setBrand(String newValue) {
        brand = newValue;
    }

    public void changeTime(int newValue) {
        time = newValue;
    }

    public void printStates() {
        System.out.println("brand:"
                + brand + " time:"
                + time);
    }

    @Override
    public void incTime(int increment) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void decTime(int decrement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
