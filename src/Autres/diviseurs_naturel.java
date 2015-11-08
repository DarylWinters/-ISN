/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autres;

import java.util.Scanner;



/**
 *
 * @author guilhem
 */
public class diviseurs_naturel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ce programme permet de calculer la liste des diviseurs naturel");
        int n, i;
        
        try (Scanner lectureClavier = new Scanner(System.in)) {
            System.out.print("Donner un entier naturel non nul:");
            n = lectureClavier.nextInt();
            
        } 
          
      for(i=1; i<=n; i= i+1)
  {
   if (n%i == 0) System.out.println(i + " est un diviseur naturel de " + n);
      
  }
      System.out.println("Fin de la liste");
    }
   
}
