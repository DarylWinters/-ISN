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
     *  Fonction tri
     * @param  tableau (un tableau d'entier)
     * @return Un tableau de même taille que tableau, 
     *         contenant tous les éléments de tableau
     *         réarrangés les pairs au début et les impairs en fin.
     */
   static int[] RangementTableau(int[] tableau){
       
        int[] tableauRange = new int[tableau.length];
        int indexPair = 0;
        int indexImpair = (tableau.length - 1) ;    
        
        for (int i=0; i<tableau.length; i++){
             if (tableau[i] % 2 == 0) {           
                tableauRange[indexPair] = tableau[i];
                indexPair++; 
             }
             else {
                 tableauRange[indexImpair] = tableau[i];
                 indexImpair--; 
             }
        }
       
      
        
        return tableauRange; 
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
            System.out.print(table[c]+", ");
        }
       
        System.out.println("\n" + "Génération terminé");
        System.out.println("Génération du tableau : \n");
        int[] tableaurange = RangementTableau(table); 
        
        for (int i=0; i<table.length; i++){ 
            System.out.print(tableaurange[i]+" | ");
        }

    }

    
}

