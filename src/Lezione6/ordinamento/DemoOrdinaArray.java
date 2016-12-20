/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione6.ordinamento;

/**
 *
 * @author tss
 */
public class DemoOrdinaArray {

    public static void main(String[] args) {

        // crea array di persone
        Persona p1 = new Persona("Marco", "Rossi");
        Persona p2 = new Persona("Gianni", "Verdi");
        Persona p3 = new Persona("sandro", "Bianchi");

        Persona[] persone = new Persona[3];
        persone[0] = p1;
        persone[1] = p2;
        persone[2] = p3;

        //stampa array
        stampa(persone);

        ordina(persone);

        stampa(persone);

    }
    //rixhiama metodo ordina passando l'array di persone
// stampa array ordinato

    private static void stampa(Persona[] persone) {
        System.out.println(".........STAMPA..........");
        for (Persona persona : persone) {
            System.out.println(persona);
        }
        System.out.println("...........FINE STAMPA........");
    }
// ordinamento con BubbleSort

    private static void ordina(Persona[] persone) {

        boolean disordinato;
        
        do { // prende l'elemento corrente , quello successivo e li compara per metterli in ordine.
            disordinato = false;
            for (int i = 0; i < persone.length -1; i++) {
                Persona p = persone[i];
                Persona pNext = persone[i + 1];
                if (p.compareTo(pNext) >= 0) {
                    //scambio

                    persone[i] = pNext;
                    persone[i + 1] = p;
                    disordinato = true;
                }
            }

        } while (disordinato);

    }

}
