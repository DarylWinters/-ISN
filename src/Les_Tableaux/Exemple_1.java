/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Les_Tableaux;

/**
 *
 * @author guilhem
 */
public class Exemple_1 {

    /**
     * @param tableau
     * @param args the command line arguments
     */
    
    static void affichetable(double[] tableau){
       
        for (int i=0; i<tableau.length; i++){
            System.out.println(tableau[i]);
        }
        
        
    }
    
    public static void main(String[] args) {
        
        
      double[] moyenne;   
      moyenne = new double[]{12,1,17,14};  
      
      affichetable(moyenne); 
       
        
    }
    
}
