/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione3.giocodadi;

/**
 *
 * @author tss
 */
public class DemoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // creo oggetti giocatore
        Giocatore g = new Giocatore ("Rossi" , 100);
        
        // creo oggetti dado, uno per il giocatore ed uno per il banco
        Dado gDado = new Dado (6);
        Dado bDado = new Dado (6);
          
        Contatore contaMani = new Contatore (0,1);
        
        
            while (g.saldo () > 0 ) {
                contaMani.conta();
    int lancioGiocatore = gDado.lancio();
    int lancioBanco = bDado.lancio();
    if (lancioGiocatore > lancioBanco) {
        g.vince ();
    } else {
        g.perde ();
    }
     System.out.println(contaMani.valoreCorrente() + " risultato lancio: Giocatore  " + lancioGiocatore + " ..... Banco -> " + lancioBanco );
    g.stampa();
}
}
}