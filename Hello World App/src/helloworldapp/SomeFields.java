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
public class SomeFields {
static int a;    
static byte b;    
static short c;
static long d;
static float e;
static double i;
static boolean f;
static char g;

    private static void myBehav() {
       int a = 0;
  System.out.println(" a_loc= "+a);
    }
String bb;

    public static void main(String[] args) {
        System.out.println(" a= "+a);
        System.out.println(" b= "+b);
        System.out.println(" c= "+c);
        System.out.println(" d= "+d);
        System.out.println(" e= "+e);
        System.out.println(" i= "+i);
        System.out.println(" f= "+f);
        System.out.println(" g= "+g);
        myBehav();
    }

    public SomeFields(int _a) {
        _a = 1;
        this.bb = "test";
    }
}
