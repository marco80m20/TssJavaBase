/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione4;

/**
 *
 * @author tss
 */
public class DemoClassiAnnidate {
    
    public static void main(String[] args) {
    
    }
        
}
    
    
    class Persona {
        private String nome, cognome;
        private Indirizzo indirizzo;

    Persona(String mario, String rossi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
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
        
        class Indirizzo {
            private String indirizzi;
            private int numero, cap ;
            private String città;

        public String getIndirizzi() {
            return indirizzi;
        }

        public void setIndirizzi(String indirizzi) {
            this.indirizzi = indirizzi;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public int getCap() {
            return cap;
        }

        public void setCap(int cap) {
            this.cap = cap;
        }

        public String getCittà() {
            return città;
        }

        public void setCittà(String città) {
            this.città = città;
        }
            
            
        }
    }

