/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione7.interfacce;

/**
 *
 * @author tss
 */
public interface MultiMedia {

    // nell'intefaccia
    public static final String PLAYER = "CD PLAYER";

    void play();

    void stop();

    void pause();

    // metodo che contiene implementazione di default , non richiede di essere implementato nelle altri classi
    default public void reset() {
        System.out.println(this.getClass() + ".." + "reset ()....di default");
    }

    public static String version() {
        return "1.0";
    }

}
