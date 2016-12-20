/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione5;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author tss
 */
public class Persona {

    private String nome;
    private String cognome;
    private String sesso;
    private Date data;

    // in caso di caricamento su database devo creare anche un costruttore vuoto
    // il primo costruttore richiama il secondo mettondo null nei parametri
    public Persona(String nome, String cognome) {
        this(nome, cognome, null, null);
    }

    // secondo costruttore con tutti i dati richiestoi
    public Persona(String nome, String cognome, String sesso, Date data) {
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = cognome;
        this.data = data;
    }

    //metodi
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    // vado a riscrivere la firma del metodo toString.
    // riscrivo lo stesso metodo e gli dico cosa voglio che faccia

    @Override
    public String toString() {
        return nome + "," + cognome;
    }

   /* @Override// tuttt i figli di object, 
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != Persona.class) {
            return false;
        }
        // per fare confronto tra nome e cognome
        // se la classe dell'oggetto(tipo di oggetto) assegnato a obj è diversa da persona ritorna falso.
        Persona p = (Persona) obj; // assegna a obj p, facendolo diventare di tipo persona. Serve per convertire .Cast

        if (this.getNome().equals(p.getNome())// this fa riferimento all'istanza corrente
                && this.getCognome().equals(p.getCognome())) {
            return true;
        } else {
            return false;
        }*/

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nome);
        hash = 47 * hash + Objects.hashCode(this.cognome);
        return hash;
    }

    @Override// equals e hashcode
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cognome, other.cognome)) {
            return false;
        }
        return true;
    }
    
    }


