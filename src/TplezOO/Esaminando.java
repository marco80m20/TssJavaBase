/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TplezOO;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Esaminando {

    // prima cosa elenco caratteristiche oggetto (alunno)
    String cognome;
    String nome;
    private int voto;

    // metodi e abilità dell'oggetto
    // imposto voto
    void impostaVoto(int voto) {
        if (voto >= 0 && voto <= 100) {
// this.voto per prendere la caratteristica dell'oggetto
            this.voto = voto;
        } else {
            JOptionPane.showMessageDialog(null, "valore errato");
        }
    }
    //leggo il voto
     int leggoVoto(){
         return voto;
     }    
    
    
    String cometichiami() {
        // dichiaro la variabile di ritorno
        String ris = "";
        //elaboro con le mie proprietà la frase di presentazione
        ris = "Ciao a tutti , mi chiamo " + nome + " " + cognome ;
        // ritorno la frase
        return ris;
    }
   boolean  seipiubravodi ( Esaminando avversario){
    boolean ris = false;
     if (this.voto >= avversario.leggoVoto())
         ris = true;
         return ris;
}
}