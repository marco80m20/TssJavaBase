/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione3;

/**
 *
 * @author tss
 */
public class TestSwitch {

    public static void main(String[] args) {

        int x = 5;
        //switch
        switch (x) {
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            default:
                System.out.println("altro");
                break;
        }
        // alternativa con if else
        if (x == 1) {
            System.out.println("uno");
        } else if (x == 2) {
            System.out.println("due");
        } else if (x == 3) {
            System.out.println("tre");
        } else {
            System.out.println("altro");
        }
    }
}


    

