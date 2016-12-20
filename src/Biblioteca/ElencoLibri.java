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
public class ElencoLibri {
    
    String nomeLibro;
    int codiceLibro;
    ArrayList<Libro> elencoLibri = new ArrayList<Libro>();
    
    public void addLibro (Libro libro) {
        elencoLibri.add(libro);
    }
}
