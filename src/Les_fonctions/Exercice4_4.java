/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Les_fonctions;

/**
 *
 * @author guilhem
 *
 */
public class Exercice4_4 {

    
    // 1)
     static int pgv(int x,int y){ 
     int a;
             a = Math.max(x, y); 
   
              return a; 
          }
     
     // 2)
     static String mots(int x, String mot){           
     String repetition = null; 
             
     for (int i=1;i<=x;i++)
        {
         repetition=repetition + mot; 
        }
     
      return repetition; 
            
          }
       
     
     // 3)
    
     /**
      * @param bornesup: Entier représentant la borne suppérieure de l'intervalle
      * @param borneinf: Entier représentant la borne inférieure de l'intervalle (borninf < bornesup) 
      * @return Un nombre aléatoire compris entre l'intervalle 
      **/
 
      static int random(int bornesup, int borneinf){           
       
      int intervalle = (bornesup - borneinf) + 1;     
      return (int)(Math.random() * intervalle) + borneinf;

      }
      //4)
      
      /**
       * @param a: la longueur du segment a
       * @param b: la longueur du segment b
       * @param c: le longueur du segment c
       * @return  Si oui ou non (True or False) le triangle est constructible 
       **/
      
      static boolean triangle(double a, double b, double c){   
      boolean oui_ou_non;
      double le_plus_grand1 = Math.max(a,b); 
      double le_plus_grand2 = Math.max(le_plus_grand1,c); 
   
      oui_ou_non = a+b+c >= (le_plus_grand2*2);
   
      return oui_ou_non;
      }
      
      
      
      
      
     
    
    
    public static void main(String[] args) {
      
    }
    
}
