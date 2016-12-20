/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione5;

/**
 *
 * @author tss
 */
public class DemoPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Autista a = new Autista("Mario ", "Rossi", " B ");
        Persona p = new Persona("giuseppe", "verdi");
        Object [] persone = new Object  [2];
        persone [0] = a;
        persone [1] = p;
        stampa (persone);
    
        // il tipo di una variabile rappresenta ciò che la variabile vede.
        // con object vedo solo la parte object , con persona vedo entrambi .
        //.toString prende la rappresentazione string dell'oggetto
        //Lezione5.Persona@4aa298b7
        // System.out.println(p.toString()); //p estende object // Persona è Object
        // nel 99.9% dei casi quando faccio la classe persona vado a fare anche override del metodo string
        
        
    }// stampare un array di persone e autisti 
        public static void stampa (Object [] anagrafica) {
            // ciclo for posso farla in due modi 
            
          //  for (int i = 0; i < anagrafica.length; i++) {
            //    Object o = anagrafica [1];
                
            
            // questo è for each, per ogni elemento di object gli assegnamo l'anagrafica e la stampiamo.
            for (Object o : anagrafica) {
                System.out.println(o.toString());
                
                // equals serve per confrontare due oggetti, confronta i puntatori, se i puntatori sono uguali o diversi.
            }
        } 
}
