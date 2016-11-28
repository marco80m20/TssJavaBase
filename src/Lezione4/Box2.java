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
public class Box2 {
    //passasggio parametri
    private Bycicle bici;

    public Bycicle getBici() {
        return bici;
    }

    public void setBici(Bycicle param) {
        param.setSpeed(0);
        this.bici = param;
    }
    
    
}
