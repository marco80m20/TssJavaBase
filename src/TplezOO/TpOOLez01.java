/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TplezOO;

/**
 *
 * @author tss
 */
public class TpOOLez01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   // genero oggetto alunno1 di tipo Esaminando
    String output;
    Esaminando alunno1 = new Esaminando();
    alunno1.cognome = "guerrubi";
    alunno1.nome = "guerrubi";
    alunno1.impostaVoto(85);
    output = alunno1.cometichiami() + " voto: " + alunno1.leggoVoto();
    System.out.println(output);
      
    
    Esaminando alunno2 = new Esaminando();
    alunno2.cognome = "zuzzurro";
    alunno2.nome = "gaspare";
    alunno2.impostaVoto(70);
    
    output = alunno2.cometichiami() + " voto: " + alunno2.leggoVoto();
    System.out.println(output);
    
    if (alunno1.seipiubravodi (alunno2)){
        output = " bravo " + alunno1.cognome;
    
    }else {
        output = " bravo " + alunno2.cognome;
        
    }
    System.out.println(output);
    }
    
}

