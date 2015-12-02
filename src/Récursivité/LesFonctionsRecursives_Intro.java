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
public class LesFonctionsRecursives_Intro {

    /**
     * @param args the command line arguments
     */
    static int u(int n){
        if(n>0){
           return 2*u(n-1)+3; 
        }
        else return 1;     
    }
    static int factorielle(int n){
        if(n>0){
           return factorielle(n-1)*n; 
        }
        else return 1;     
    }
    
    static String verlan(String mot){
        String resultat; 
        int longueur = mot.length()-1;
        if(longueur < 1){
           resultat = mot; 
        }
        else {
            resultat = mot.charAt(longueur) + verlan(mot.substring(0, longueur) ); 
        }
            return resultat;     
    }
    
    static int puissance(int a, int n){
        int resultat;
        if (n == 0){
            resultat = 1;
        } else{
            resultat = (a*puissance(a,n-1)); 
        }
        return resultat; 
    }
    
        static int puissance2(int a, int n){
        int resultat;
        if (n == 0){
            resultat = 1;
        } else{
            int index = n;
            if (index % 2 != 0){
                index = puissance2(a,(n-1))*a;
                resultat = index; 
            } else{
                index = puissance2(a,n/2);
                resultat = index*index; 
          }
        
        }
        return resultat; 
    }
    
    
    public static void main(String[] args) {
        System.out.println(u(2));    
        System.out.println(factorielle(5));
        System.out.println(verlan("guilhem"));
        System.out.println(puissance(2,4));    
        System.out.println(puissance2(2,4));
    }
    
}
 