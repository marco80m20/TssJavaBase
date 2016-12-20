/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asta;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Persona {

    String cognome;
    int soldi;

    public Offerta nuovaOfferta() {
        String nomeOggetto = JOptionPane.showInputDialog("nome oggetto ATTENZIONE precisione!!!");

        String tmp = JOptionPane.showInputDialog("offerta per oggetto in euro!!!");
        int valore = Integer.parseInt(tmp);

        Offerta nuovaofferta = new Offerta(valore, cognome, nomeOggetto);

        return nuovaofferta;
    }

}