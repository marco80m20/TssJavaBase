/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione6.ordinamento;

/**
 *
 * @author tss
 */
public class DemoOrdinamento {
    
    public static void main(String[] args) {
        
      Persona p1 = new Persona("MArio", "cognome");
      Persona p2 = new Persona("nome", "abba");
    
    System.out.println(p1.compareTo(p2));
    }
}
