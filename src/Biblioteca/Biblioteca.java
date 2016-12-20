/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    private String nomeBiblioteca;
    private String indirizzo;
    private int maxLibri ;
    private ArrayList<Libro> elencoLibri = new ArrayList<Libro>();
    private ArrayList<Dipendente> elencoDipendenti = new ArrayList<Dipendente>();
    private ArrayList<Cliente> elencoClienti = new ArrayList<Cliente>();
    private ArrayList<Prestito> elencoPrestiti = new ArrayList<Prestito>();

    public Biblioteca(String nomeBiblioteca, String indirizzo) {
        this.nomeBiblioteca = nomeBiblioteca;
        this.indirizzo = indirizzo;
        this.maxLibri=2;
    }

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public int getMaxLibri() {
        return maxLibri;
    }

    
    
    public String getIndirizzo() {
        return indirizzo;
    }

    public ArrayList<Prestito> getElencoPrestiti() {
        return elencoPrestiti;
    }

    public ArrayList<Libro> getElencoLibri() {
        return elencoLibri;
    }

    public ArrayList<Dipendente> getElencoDipendenti() {
        return elencoDipendenti;
    }

    public ArrayList<Cliente> getElencoClienti() {
        return elencoClienti;
    }

    public String getSchedario() {
        String msg = "";
        for (int i = 0; i < elencoLibri.size(); i++) {
            Libro l = elencoLibri.get(i);
            msg = msg + l.getCodLibro() + " - " + l.getTitolo() + " - " + l.getAutore() + "\n";
        }
        return msg;
    }
    public boolean isDisponibile (int codLibro) {
        boolean ok = true;
        
        // metodo per verificare se il libro è disponibile
       // for (int i =0; i= elencoPrestiti.size(); i++){
            //if (elencoPrestiti.get(i).codLibro == codLibro
               //     && elencoPrestiti.get(i).dataRestituzione.equals("")) {
            //    ok= false;
             //   break;
          //  }
      //  }
        // variante migliore 
        for (Prestito p : elencoPrestiti ) {
            if (p.codLibro == codLibro && p.dataRestituzione.equals("")){
                ok = false;
                break;
            }
            }
        
    }
        public boolean isClienteMoroso (int codCliente){
        boolean ko = false;
        int conta = 0; // metodo migliore per ciclare su una collezione ( più oggetti)
        for (Prestito p : elencoPrestiti) {
            // se prestito del cliente e non è restituito con data, aumento la sua conta
            if (p.codCliente == codCliente && p.dataRestituzione.equals("")){
                conta++;
                // verifico che non sfori il max e nel caso lo"casso" con ko true
                if (conta >= maxLibri) ko = true;
            }
        }
        return ko;
        }
            }
        
}
    
