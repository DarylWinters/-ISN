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
public class Exercice3_14 {

    /**
     * @param args the command line arguments
     */
        static int plusGrandEntier(int[] tableau){
        int lePlusGrand = tableau[0];
        for (int i=0; i<tableau.length; i++){
             if (tableau[i]>lePlusGrand) {           
                lePlusGrand = tableau[i];
             }
        }
        return lePlusGrand;
    }
  
    
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Donner le nombre d'entiers: ");
        n = in.nextInt();
        int[] table = new int[n];
        
        System.out.println("\n Génération d'une liste d'entiers ( "+n+" entiers)");
        for (int c =0;c<n;c++){
            table[c] = (int) (1+Math.random()*101);
            System.out.println(table[c]);
        }
       
        System.out.println("\n" + "Génération terminé");
        System.out.println("Le plus grand nombre du tableau est : " + plusGrandEntier(table)); 
    }
    
}

