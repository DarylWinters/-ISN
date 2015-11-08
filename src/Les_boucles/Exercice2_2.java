/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Les_boucles;

import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane; 

/**
 *
 * @author guilhem
 */
public class Exercice2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         System.out.println("Ce programme sert à calculer la température moyenne sur un nombre de jours donné");
        Scanner lectureClavier = new Scanner(System.in); 
       
        double total = 0;
        double température;  
        int nbdejours;                 
     
         
        
   //nbdejours = Integer.parseInt(JOptionPane.showInputDialog(null, "Entrez le nombre de jour"));
      System.out.print("Entrez le nombre de jours: ");
      nbdejours = lectureClavier.nextInt();
        
        
        
        
  for (int i = 0; i < nbdejours; i++){
      
      //température = Integer.parseInt(JOptionPane.showInputDialog(null, "Entrer la température du jour " + (i+1)));
      System.out.print("Entrez la température du jour " + (i+1) + " en °C: ");
      température = lectureClavier.nextDouble();
      total = total + température;
      lectureClavier.close();
      
  }
 
       
  double moyenne; 
  moyenne = total / nbdejours;
 System.out.print("La moyenne des températures sur une période de "+ nbdejours +" jours est: "+ moyenne + " °C");
 //JOptionPane.showMessageDialog(null,  "La moyenne des températures sur une période de "+ nbdejours +" jours est: "+ moyenne + " °C");
       
    }
}

      

    

