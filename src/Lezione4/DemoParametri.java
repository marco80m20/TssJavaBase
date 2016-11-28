/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione4;

/**
 *
 * @author tss
 */
public class DemoParametri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Bycicle bici = new Bycicle(0, 1);
        

        bici.setSpeed(100);

        System.out.println(bici.getSpeed());
        // passaggio per valore
        Box box = new Box();

        int numero = 10;

        box.setN(bici);
        // se stampo numero quanto vale??
        System.out.println("numero: " + bici);
    }
    
    
    
    
}
