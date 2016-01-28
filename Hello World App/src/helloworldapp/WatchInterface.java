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
public interface WatchInterface {

    void setBrand(String newValue);

    void changeTime(int newValue);

    void incTime(int increment);

    void decTime(int decrement);

    void printStates();
}
