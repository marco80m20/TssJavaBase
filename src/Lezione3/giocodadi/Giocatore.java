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
public class Giocatore {
    
    private String nome;
    private int soldi;
    // metodo costruttore che si chiama esattamente come la classe 

    public Giocatore(String nomeGiocatore, int credito) {
        nome = nomeGiocatore;
        soldi = credito;
    }

    
    
    public void vince () {
        soldi ++;
    }
    
    public void perde (){
        soldi--;
    }
    public void stampa(){
        System.out.println(" Nome " + nome + " , soldi " + soldi );
    }
        public int saldo (){
            return soldi;
        }
    }

