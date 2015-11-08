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
public class Exercice3_15 {

    /**
     * @param args the command line arguments
     */
    
    /**
     * Fonction qui lit les nombres d'un tableau de nombre entier et crée un tableau répartissant les nombres pairs à gauche et impairs à droite
     * @param tableau 
     */
   static int[] RangementTableau(int[] tableau){
       
       int[] nouvelleTable = new int[tableau.length];       
       for (int i=0; i<tableau.length; i++){
          if (tableau[i] % 2 == 0) {
            
              nouvelleTable[i] = (tableau[i]); 
            
             System.out.println(tableau[i]);
  
          }
          else { 
           nouvelleTable[i] = (tableau[i]); 
           System.out.println("           "+tableau[i]);
          }
        System.out.println("      |");  
        }
        return nouvelleTable; 
    }
   
  static void Trait(){     
          System.out.println("---------------");               
    }
    
    public static void main(String[] args) {
        
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
        System.out.println("Génération du tableau : \n");
        Trait();
        System.out.println("Pairs | Impairs");
        Trait();
        RangementTableau(table); 
        Trait();
    }

    
}

