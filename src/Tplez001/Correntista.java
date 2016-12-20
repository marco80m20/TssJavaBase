/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tplez001;

/**
 *
 * @author tss
 */
public class Correntista {

    private String nome;
    private String cognome;
    private int data_nascita;
    private double conto_corrente;
    private int min, max;

    public Correntista(String nome, String cognome, int data_nascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.data_nascita = data_nascita;
        min = -5000;
        max = 10000;
    }

    public boolean impostaConto(double conto) {
// massimail min , max

        if (conto >= min && conto < max) {
            this.conto_corrente = conto_corrente + conto;
            return true;
        } else {
            return false;
        }
    }

    public double leggoConto() {
        return conto_corrente;

    }

    public String getInfo() {
        String ris= "Dati Correntista....\n";
        ris+= nome + "\n";
        ris+= cognome + "\n";
        ris+= "Saldo Conto " + conto_corrente + "\n";
       return ris;

    }
}
