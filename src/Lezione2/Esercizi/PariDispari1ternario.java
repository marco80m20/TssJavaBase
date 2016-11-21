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
public class PariDispari1ternario {

    public static void main(String[] args) {
        
        String risultato ;
        
        //Crea oggetto scanner per leggere input
        Scanner s= new Scanner (System.in);
        
        System.out.println("Inserisci il numero:");
        //leggo il numero in input
        int numero =s.nextInt();
              
        risultato = ( numero % 2) == 0 ? " Il numero è pari" : " Il numero è dispari";
        
             
            }
        
                
        
    }
    
    
    
