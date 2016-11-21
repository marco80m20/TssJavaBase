/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione2.Esercizi;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class PariDispari1 {
    
    public static void main(String[] args) {
        String risultato;
       
        Scanner s= new Scanner (System.in);
        
        System.out.println("Inserisci il numero:");
        //leggo il numero in input
        int numero =s.nextInt();

        int indice =0 ;

        while ( indice < numero){
         indice += 2 ;
        }
         risultato = (indice == numero) ? " il numero è pari" : "Il numero è dispari";
        
         System.out.println ( risultato);
        
        
        
    }
    

    }
