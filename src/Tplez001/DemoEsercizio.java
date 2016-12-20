/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tplez001;

/**
 *
 * @author tss
 */
public class DemoEsercizio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       

        Correntista conto1 = new Correntista("Bafasfasfa", "sdfsdfsfss", 1980);
        conto1.impostaConto(1234);
        conto1.impostaConto(-200);
        
        System.out.println(conto1.getInfo());
    }
        
}
