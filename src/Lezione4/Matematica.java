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
public class Matematica {
    
    // metodo con varargs
    // indica un numero variabile di parametri
    public long somma (int...numeri) {
    long risultato = 0;
        for (int i = 0; i < numeri.length; i++) {
            risultato += numeri [i];
        }
        return risultato;
        //equivalente
    } public long somma (int []...numeri) {
        return 0;
        
    }
    
    
}


