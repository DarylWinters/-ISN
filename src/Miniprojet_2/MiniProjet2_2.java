package Miniprojet_2; // mettre à jour


/**
 *
 * @author Guilhem PECH
 */
public class MiniProjet2_2 {

   /**
    * Fonction qui compare la hauteur de deux image et renvoi la plus petite hauteur
    * @param fond
    * @param imageACacher
    * @return La plus petite hauteur
    */
    public static int hauteurIdeale(IHMImage fond, IHMImage imageACacher) {
        return Math.min(fond.hauteur(),imageACacher.hauteur());
    }
    
    /**
     * Fonction qui compare la largeur de deux image et renvoi la plus petite largeur
     * @param fond
     * @param imageACacher
     * @return La plus petite largeur
     */
    public static int largeurIdeale(IHMImage fond, IHMImage imageACacher) {
        return Math.min(fond.largeur(), imageACacher.largeur());
    }
    
    
    
    
    
    /**
     * Cette fonction 'cache' une image dans une autre image en utilisant le procédé de LSB (Least Significant Bit) 
     * @param fond
     * @param imageACacher
     * @return L'image caché dans l'image
     */
    public static IHMImage cache(IHMImage fond, IHMImage imageACacher) {
                      
        // Initialisation d'une nouvelle image qui a les dimension du support    
        IHMImage imgCacheDansImage = new IHMImage(largeurIdeale(fond,imageACacher), hauteurIdeale(fond,imageACacher));
           
        
        for (int j = 0 ; j <  imgCacheDansImage.hauteur(); j++){
            for (int i = 0 ; i < imgCacheDansImage.largeur(); i++){
                   
                   // Grâce a ce procédé met à 0 les 3 derniers bits de chaques pixels de l'image de fond
                int[] rgb = fond.getPixel(i,j);
                int rouge = rgb[0] & 0b11111000;
                int vert = rgb[1] & 0b11111000;
                int bleu = rgb[2] & 0b11111000;
                   
                   // On met à 0 les bits 'non forts' et on décale de 5 bits pour avoir les 3 bits 'fort' à la place des derniers (de l'image à cacher)
                int[] rgb1 = imageACacher.getPixel(i,j);
                int rouge1 = (rgb1[0]& 0b11100000)>>5; 
                int vert1 = (rgb1[1]& 0b11100000)>>5;
                int bleu1 = (rgb1[2]& 0b11100000)>>5;
                   
                   // On fusione les deux
                   
                int r = rouge | rouge1;
                int v = vert | vert1;
                int b = bleu | bleu1;
                   
                   // On le place dans une nouvelle image pixel par pixel
                imgCacheDansImage.putPixel(i, j, r,v,b);
            }
        } 

    return imgCacheDansImage;
    }

                    
    /**
     * Cette fonction extrait l'image caché par la fonction cache(img1,img2) 
     * @param imgAExtraire
     * @return L'image qui était caché
     */
    public static IHMImage extrait(IHMImage imgAExtraire){
        
        int largeur = imgAExtraire.largeur();
        int hauteur = imgAExtraire.hauteur();
        // Initialisation d'une nouvelle image qui correspondra à l'image extraite  
        IHMImage imgExtraite = new IHMImage(largeur, hauteur);
        // Cette boucle parse tous les pixels de l'image
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
   
}
