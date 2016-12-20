/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione6.generics;

/**
 *
 * @author tss
 */
public class DemoBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

         Box <Persona> box = new Box <> (new Persona("xxx","yyy"));
        Persona p = box.getObject();
        
        Box <Message> box1 = new Box <> (new Message ("Ciao"));
         
        //if (box.getObject() instanceof Persona) {

          /*  Persona p = (Persona) box.getObject();
            p.setCognome("XXXX");
            System.out.println(box.getObject().getClass());
            
            Box box1= new Box(new Message("Ciao"));
            Message msg = (Message) box1.getObject();
            
            System.out.println(box1.getObject().getClass());*/
        
          
          // l'array list implementa la list , serve che se io faccio una lista di oggetti, 
          // mi prende tutti i parametri dell'object. (nell'array)
          
          
    }
}
