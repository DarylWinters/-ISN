/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autres;

/**
 *
 * @author guilh
 */
public class triparselection {

    static int[] table = new int[20] ; // le tableau à trier : 20 éléments 
    static void AfficherTable ( ) {
     // Affichage du tableau 
        int n = table.length-1;
        for ( int i = 1; i <= n; i++) 
            System.out.print(table[i]+" , ");
         System.out.println();
    }

     static void InitTable  ( ) {
     // remplissage aléatoire du tableau 
        int n = table.length-1;
        for ( int i = 1; i <= n; i++) 
          table[i] = (int)(Math.random()*100);
    }
static void TriSelect ( ) {
  // sous-programme de Tri par sélection : on trie les éléments du n°1 au  n°19
        int n = table.length-1;
        for ( int i = 1; i <= n-1; i++)
         { // recommence une sous-suite 
           int m = i; // i est l'indice de l'élément frontière ai = table[ i ]
           for ( int j = i+1; j <= n; j++)   // (ai+1, a2, ... , an) 
              if (table[ j ] < table[ m ]) // aj est le nouveau minimum partiel
                  m = j ; // indice mémorisé
           //on échange les positions de ai et de aj :
               int temp = table[ m ];
               table[ m ] = table[ i ];
               table[ i ] = temp;
   }
}
public static void main(String[] args) {
         InitTable ( );
         System.out.println("Tableau initial :");
         AfficherTable ( );
         TriSelect ( );
         System.out.println("Tableau une fois trié : ");
        AfficherTable ( );
  
}
    
}
