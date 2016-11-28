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
public class Bycicle {

    private int speed;
    private int gear;
    // statico che vale per tutti
    private static int numeroDiIstanze =0;
//costruttore, MI SEERVE PER GUIDARE LA COSTRUZIONE DI UN OGGETTO nome identico al
    //nome della classe . Serve per dare le caratteristiche iniziali dell'oggetto
    //no tipo di ritorno
    public Bycicle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
        this.numeroDiIstanze ++;
    }
    //più costruttori
    //public Bycicle() {
      //  speed=1; }
    //public Bycicle (int speed, int gear){
    // this.speed =speed;
    // this.gear = gear; }
    // public Bycicle (int speed) {
      //  this.speed; } 
    
 // accesso in lettura che porta in visualizzazione la caratteristica privata
    // per leggegere la velocità
    public int getSpeed () { // get = dammi
    return speed;
}
// per variare la velocità
    public void setSpeed (int valore) { //set = imposta
        speed = valore;
    }
    
       //  insert code - getter and setter
    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
    public int getNumeroDiIstanze (){
        return numeroDiIstanze;
    }
}