/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Les_Tableaux;

import java.util.Scanner;

/**
 *
 * @author guilhem
 */
public class Exercice3_13 {

    /**
     * Ecrire un programme qui compte le nombre d'éléments supérieurs à 10 dans un tableau d'entier
     * @param args the command line arguments
     */
    
    static int nbEntierSuperieurADix(int[] tableau){
        int lenombre = 0;
        for (int i=0; i<tableau.length; i++){
             if (tableau[i]>=10) {           
                lenombre = lenombre + 1;
             }
        }
        return lenombre;
    }
  
    
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Donner le nombre d'entiers: ");
        n = in.nextInt();
        int[] table = new int[n];
        
        System.out.println("\n Génération d'une liste d'entiers ( "+n+" entiers + ou - 1)");
        for (int c =0;c<n;c++){
            table[c] = (int) (1+Math.random()*20);
            System.out.println(table[c]);
        }
       
        System.out.println("\n" + "Génération terminé");
        System.out.println("Nombre de notes supérieur à dix: " + nbEntierSuperieurADix(table)); 
    }
    
}
