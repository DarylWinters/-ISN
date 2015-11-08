package Les_boucles;

import java.util.Scanner;

/**
 *
 * @author guilhem
 */
public class Exercice2__17 {

    
    
    
    /**
     * @param args the command line arguments
     */
    
    
     static double fonction(double x){ 
           double y; 
           y = x*x+2*x-2; 
              return y; 
          }
    
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in); 
    double bornesup, step, x; 
    double borneinf;
    System.out.println("Ce programme affiche un tableau de valeur pour f(x)=x²-2x-2 sur un intervalle donné");
    System.out.print("Donner la borne inférieure de l'intervalle: ");
            borneinf = clavier.nextDouble();
            System.out.print("Donner la borne suppérieure de l'intervalle: ");
            bornesup = clavier.nextDouble(); 
            
             if (bornesup<borneinf){
                System.out.print("Erreur, borne supérieure inférieure à la borne inférieure, veuillez réésayer !");
           
   }    
             else{
            
            System.out.print("Donner le 'pas': ");
            step = clavier.nextDouble(); 
         if(step<0){
          System.out.print("Erreur, pas négatif, veuillez réésayer !");   
         }
         else{
            
         x = borneinf; 
     
                
    while (x<=bornesup){
        
        System.out.println("Lorsque x = "+x+" , f(x)= "+fonction(x));
        x = x+step;
        
    } 
   
       
            System.out.println("Fin. ");
    }
    }
    }
}
