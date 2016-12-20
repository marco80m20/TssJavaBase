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
public class DemoEquals {

    public static void main(String[] args) {

        Autista p = new Autista("Mario", " Rossi ", "b");
        Autista a = new Autista("Pippo", " Verdi ", "c");

        
        Autista daCercare = new Autista ("Pippo", "Verdi", "c");
        
        Object [] persone = new Object  [2];
        persone [0] = a;
        persone [1] = p;
        
        int risultato = cerca (persone , daCercare);
        // equals serve per confrontare due oggetti, confronta i puntatori, se i puntatori sono uguali o diversi.
        //non il contenuto ma il puntatore.
        System.out.println(risultato);
    }
    // Ricerca di un elemento all'interno di un vettore e ritorna l'indice della prima occorrenza trovata.

    // parametro anagrafica vettore doce ricercare
    //parametro elemento elemento da cercare all'interno del vettore
    // return indice dell'elemento se trovato, altrimenti -1
    public static int cerca(Object[] anagrafica, Object elemento) {
        for (int i = 0; i < anagrafica.length; i++) {
            if (anagrafica[i].equals(elemento)) {
                return i;
            }

        }
        return -1;
    }
}
