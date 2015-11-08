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
public class Premier_Exemple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] moyenneIsn = new double [11];
        moyenneIsn[0]=12;
        moyenneIsn[1]=9.5;
        // ...
        moyenneIsn[10]=17;
        
        // Ou bien
        
       // moyenneIsn = new double[]{12, 1.5, /* ... */ 17};

         // Connaitre le nombre de valeurs dans un tableau:
        
        int longueur = moyenneIsn.length; 
      System.out.println("Longueur de tableau: "+longueur);
        
        // Exemple: 
        for (int i=0; i<longueur; i++){
            System.out.println(moyenneIsn[i]);
        }
        
       
    }
    
    
}
