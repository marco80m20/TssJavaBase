/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione7;


import java.util.Date;
import util.DateFunction;
import util.LibreriaFunzioniArray;



/**
 *
 * @author tss
 */
public class DemoOrdinaArray {

    public static void main(String[] args) {

        // crea array di persone
        Persona[] persone = new Persona[3];
        persone [0] = new Persona("Marco", "Rossi");
        persone [1] = new Persona("Gianni", "Verdi");
        persone [2] = new Persona("sandro", "Bianchi");

  

        //stampa array
        LibreriaFunzioniArray.stampa(persone);

        
        LibreriaFunzioniArray.ordina(persone);

        
        LibreriaFunzioniArray.stampa (persone);
        
        //ordine di messaggi
        Messaggio [] messaggi = new Messaggio [3];
        messaggi [0] = new Messaggio ("Ciao");
        messaggi [1] = new Messaggio ("Bye");
        messaggi [2] = new Messaggio ("Hello");
        
        
        LibreriaFunzioniArray.stampa(messaggi);
        LibreriaFunzioniArray.ordina (messaggi);
        LibreriaFunzioniArray.stampa(messaggi);
    
        System.out.println (LibreriaFunzioniArray.cerca (persone, new Persona(".", "cognome")));
        System.out.println (LibreriaFunzioniArray.cerca (messaggi , new Messaggio ("Ciao")));
        
        // stampa conversione data
        System.out.println(DateFunction.convert(new Date()));
    
        // stampa al contrario
        System.out.println("10/12/2016");
    
    }
 
    
// ordinamento con BubbleSort

    
}
