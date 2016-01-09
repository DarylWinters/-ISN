package Miniprojet_2; // mettre à jour
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author mettre à jour
 */
public class MiniProjet2_2 {

        public static boolean taille(IHMImage fond, IHMImage imageACacher) {
           boolean possible;
            boolean seccondition;
            boolean premcondition;
           
           premcondition = fond.hauteur() >= imageACacher.hauteur();
           seccondition = fond.largeur()>= imageACacher.largeur(); 
           
           possible = premcondition == true && seccondition == true; 
                       
            return possible;
        }
    
	public static IHMImage cache(IHMImage fond, IHMImage imageACacher) {
                      
            
           IHMImage imgCacheDansImage = new IHMImage(fond.largeur(), fond.hauteur());
          
           for (int j = 0 ; (j < fond.hauteur()); j++){
               for (int i = 0 ; (i < fond.largeur()) ; i++){
                   
                   // Grâce a ce procédé met à 0 les 3 derniers bits de chaques pixels de l'image de fond
                   int[] rgb = fond.getPixel(i,j);
                   int rouge = rgb[0] & 248;
                   int vert = rgb[1] & 248;
                   int bleu = rgb[2] & 248;
                   
                   // Je met à 0 les bits 'non forts' et je décale de 5 bits pour avoir les 3 bits 'fort' à la place des derniers (de l'image à cacher)
                   int[] rgb1 = imageACacher.getPixel(i,j);
                   int rouge1 = (rgb1[0]& 0b11100000)>>5;
                   int vert1 = (rgb1[1]& 0b11100000)>>5;
                   int bleu1 = (rgb1[2]& 0b11100000)>>5;
                   
                   // Je fusione les deux
                   
                   int r = rouge | rouge1;
                   int v = vert | vert1;
                   int b = bleu | bleu1;
                   
                   // Je le place dans l'image
                   imgCacheDansImage.putPixel(i, j, r,v,b);
               }
           } 
        return imgCacheDansImage;
    }
         
                    
    
    public static IHMImage extrait(IHMImage imgAExtraire){
        int largeur = imgAExtraire.largeur();
        int hauteur = imgAExtraire.hauteur();
        IHMImage imgExtraite = new IHMImage(largeur, hauteur);

        for (int i = 0 ; i<imgAExtraire.largeur() ; i++){
            for (int j = 0 ; j<imgAExtraire.hauteur() ; j++){
                
                // Je fait le procédé inverse : Je décale de 5 bits vers la droite pour avoir les bits 'fort' en 'premier' 
                int[] rgb = imgAExtraire.getPixel(i,j);
                int rouge = rgb[0]<<5 & 255;
                int vert = rgb[1]<<5 & 255;
                int bleu = rgb[2]<<5 & 255;
                imgExtraite.putPixel(i,j,rouge,vert,bleu);
            }
        }
        return imgExtraite;
    }
    
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)  throws IOException {
       
        choix.main(args); 
        
        /*String repertoireImage = "C:\\Users\\guilh\\Desktop\\img";
       IHMImage support, message, supportModifie, messageRecupere,
       supportModifieTest, messageRecupereTest;

       support = IHMImage.ouvrir(repertoireImage);
       support.afficher("LE FOND");
       message = IHMImage.ouvrir(repertoireImage);
       message.afficher("Message à cacher");

       supportModifie = cache(support, message);
       supportModifie.afficher("Image caché (A ENREGISTRER)");
       
       messageRecupere = extrait(supportModifie);
       messageRecupere.afficher("Image extraite");
        
        // test de récupération sur un support correctement modifié
       // ouvrir l'image deadwood_chat.png ou cavaliere_chat.png
       supportModifieTest = IHMImage.ouvrir(repertoireImage);
       supportModifieTest.afficher();
       messageRecupereTest = extrait(supportModifieTest);
       messageRecupereTest.afficher("Image cachée"); */
    }
}
