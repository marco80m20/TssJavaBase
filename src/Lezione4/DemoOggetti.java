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
public class DemoOggetti {
    
    public static void main(String[] args) {
        
        Bycicle b1 = new Bycicle (10,1);
        
        Bycicle b2 = new Bycicle (10,1);
        
        if (b1==b2) {
            System.out.println("uguale");
                    }
        else {
            System.out.println("diversi");// sono due oggetti con le stesse caratteristiche ma diversi
        }Bycicle b3 = b1;
        System.out.println("Numero istanze create : "+ b1.getNumeroDiIstanze());
    } // tutti i tipi che noi creiamo estende un tipo originale che si chiama object.
    // qualunque classe che andiamo a creare eredita ciò che abbiamo messo in object.
     
   
}
