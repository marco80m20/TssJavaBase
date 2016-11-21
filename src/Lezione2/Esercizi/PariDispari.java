/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione2.Esercizi;

import java.util.Scanner;

/**
 *Legge un numero in input e stampa se pari o dispari
 * 
 * @author tss
 */
public class PariDispari {

    public static void main(String[] args) {
        
        
        //Crea oggetto scanner per leggere input
        Scanner s= new Scanner (System.in);
        
        System.out.println("Inserisci il numero:");
        //leggo il numero in input
        int numero =s.nextInt();
              
        
        int pari = numero % 2 ;
             if (pari==0)
             {        
        System.out.println("Il numero inserito è pari " );
    } else {
        System.out.println(" il numero è dispari");
             
            }
        
                
        
    }
    
    
    
}
