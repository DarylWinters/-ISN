/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Récursivité;

/**
 *
 * @author guilhem
 */
public class Exercice5_1_et_2 {

    /**
     * @param args the command line arguments
     */
    static int quotient(int a, int b){
        int resultat;
        if (a < b){
            resultat = 0;
        }else{
            resultat = 1 + quotient(a-b,b); 
        }
        
        return resultat; 
    }

      static int reste(int a, int b){
        return (a-b*quotient(a,b)); 
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(quotient(14,3));
        System.out.println(reste(14,3));
    }
    
}
