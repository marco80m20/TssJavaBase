/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione2;

/**
 * Esempio di commenti java
 *
 * @author tss
 */
public class Main {
    // variabile statica

    private static int colore;
    // variabile di istanza 
    private int carattere;

    /**
     * da questo metodo partirà l'esecuzione del programma
     */
    public static void main(String[] args) {

        // commento
        /* commento su più righe
    sdgsdgsdgsdgs
    sggsgsgsdsdg
         */
        /**
         * commento multiriga che si mette alla classe e a ciscun metodo
         */
        System.out.println("Parametri in ingresso" + args);

        System.out.println("Start esempio commenti");

        // variabile locale
        int totale = 10;

        if (totale > 0) {
            //variabile locale
            int x = 5;

        } else {
            int x = 10;

        }
    }

}
