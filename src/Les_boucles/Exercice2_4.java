/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Les_boucles;

/**
 *
 * @author guilhem
 */
public class Exercice2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Ce programme affiche le calendrier pour une année");
        int mois;
        int nbdejours;
        int jour; 
    for (mois = 1; mois <=12; mois = mois+1) {
        if (mois == 2){
            nbdejours = 28;} 
        else {
            nbdejours = 30 + (mois + mois/8) % 2;} 
        System.out.println("Mois suivant:");
       
        
             for (jour = 1; jour <= nbdejours; jour = jour+1){
         System.out.print(jour);
         System.out.print(" / ");
         System.out.println(mois);}}
       System.out.println("Fin");
    }
   
}

