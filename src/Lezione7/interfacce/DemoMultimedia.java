/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lezione7.interfacce;

/**
 *
 * @author tss
 */
public class DemoMultimedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        System.out.println(MultiMedia.version());

// creiamo un nuovo cd player con le stesse caratteristiche di multimedia.
    MultiMedia mm = new CdPlayer ();
    mm.play();
    mm.stop();
    
    MultiMedia mm1 = new Mp3Player ();
    mm1.play ();
    mm1.pause ();
    mm1.stop ();
    
    MultiMedia [] medias = new MultiMedia [3];
    medias [0] = mm;
    medias [1] = mm1;
    medias [2] = new VideoPlayer ();
    
    for (MultiMedia media : medias ) {
        media.play();
        media.reset();
    }
    
}
}