/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione5;

import java.util.Objects;

/**
 *
 * @author tss
 */

// esempio per capire le estensioni
public class Autista extends Persona {
    
    private String patente;
    
    public Autista(String nome, String cognome,String patente) {
        super(nome, cognome);
        this.patente= patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override// richiama il padre Persona e ne aggiunge un pezzo ( patente)
    public String toString() {
        return super.toString() + ", Patente :" + patente;
                 //To change body of generated methods, choose Tools | Templates.
    }
    // equals serve per confrontare due oggetti, confronta i puntatori, se i puntatori sono uguali o diversi.

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.patente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        final Autista other = (Autista) obj;
        if (!Objects.equals(this.patente, other.patente)) {
            return false;
        }
        return true;
    }
    
}
