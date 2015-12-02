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
public class Exercice_TriParSelection_1 {

    /**
     * @param args the command line arguments
     */
    
    static int[] triselection(int []table){
        int i,j,imin,longueur;
        longueur= table.length;
        i=0;
        j=1;
        while (i< longueur){
            imin=i;
            j=i+1;
            while( j<longueur){
                if ( table[j] < table[imin]);
                imin=j;
                j=j+1;
        }
            if(i !=imin){
                //echange tab[i] et tab[imin]
                int aux = table[i];
                table[i] = table[imin];
                table[imin]=aux;}
        }
        i=i+1;
       return table;      
    }
        
        
    
    
    public static void main(String[] args) {
        
        int[] desEntiers;   
      desEntiers = new int[]{12,1,17,14,13,7,99,2,123}; 
     
       for (int i=0; i<desEntiers.length; i++){
            System.out.print(desEntiers[i]+" ");
        }
       triselection(desEntiers);
      for (int i=0; i<desEntiers.length; i++){
            System.out.print(desEntiers[i]+" ");
        }
    }
    
    
    
}
