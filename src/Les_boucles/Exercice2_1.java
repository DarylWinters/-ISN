/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Les_boucles;

import java.util.Scanner;

/**
 *
 * @author Guilhem Pech
 */
public class Exercice2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     double  lundi, mardi, mercredi,jeudi , vendredi, samedi, dimanche, moyennetemp = 0;
        
     
     try (Scanner lectureClavier = new Scanner(System.in)) {
            System.out.print("Donner la température du Lundi:");
            lundi = lectureClavier.nextDouble();
            System.out.print("Donner la température du Mardi:");
            mardi = lectureClavier.nextDouble(); 
            System.out.print("Donner la température du Mercredi:");
            mercredi = lectureClavier.nextDouble(); 
            System.out.print("Donner la température du Jeudi:");
            jeudi = lectureClavier.nextDouble(); 
            System.out.print("Donner la température du Vendredi:");
            vendredi = lectureClavier.nextDouble(); 
            System.out.print("Donner la température du Samedi:");
            samedi = lectureClavier.nextDouble(); 
            System.out.print("Donner la température du Dimanche:");
            dimanche = lectureClavier.nextDouble(); 
                
        }
     moyennetemp = (lundi+mardi+mercredi+jeudi+vendredi+samedi+dimanche)/7;
     System.out.print("La moyenne des températures de la semaine est:"+moyennetemp);
    }
    
} 
