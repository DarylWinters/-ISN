package LesMinisProjets; // à mettre à jour pour votre machine



/**
 * @email guilhempech@gmail.com
 * @author Guilhem PECH
 */
public class Miniprojet1_16 {

    /*
     * insérer le code de vos fonctions ici
     */
    
    /**
     * Cette fonction donne en fonction de x le reste de la division euclidienne
     * de 11x+8 par 26 
     * (x est un entier naturel compris dans l'intervalle [0;25])
     * @param x
     * @valeurs r correspond au reste de la division
     * @return Le reste de la division euclidienne
     */
    static int f(int x) {
        int r;
        r = (11 * x + 8) % 26;  
        return r;
    }

    /**
     * Cette fonction donne en fonction de y le reste de la division euclidienne
     * de 19y+4 par 26
     * (y est un entier naturel compris dans l'intervalle [0;25])
     * @param x
     * @valeurs r correspond au reste de la division
     * @return Le reste de la division euclidienne
     */
    static int g(int y) {
        int r;
        r = (19 * y + 4) % 26;
     
        return r;
    }

    /**
     * Cette fonction code une lettre en une autre.)
     *
     * @param lettre (Lettre majuscule non accentuée ou <espaces>.)
     * @return renvoie la lettre codée (lettreCodee)
     */
    
    static char code(char lettre) {
        char lettreCodee;
        if (lettre == 32){
            lettreCodee = ' '; 
        } else {
            int a = f(lettre - 65);
            lettreCodee = (char) (a + 65);
        }
        return lettreCodee;
    }

    /**
     * Cette fonction code une chaine de caractères en une autre en faisant
     * appel à la fonction code()
     *
     * @param phraseACrypter (Chaine de caractères comprenant que des lettres majuscule non accentuée et/ ou des <espaces>.)
     * @return renvoie la texte crypté (messageCrypte)
     */
    static String crypte(String phraseACrypter) {
        String messageCrypte = "";

        for (int i = 0; i < phraseACrypter.length(); ++i) {
            char d = phraseACrypter.charAt(i);
            char lettreCodee = code(d);
            messageCrypte = messageCrypte + lettreCodee;
        }

        return messageCrypte;
    }

    /**
     * Cette fonction décode une lettre crympté.
     *
     * @param lettre (Lettre majuscule non accentuée ou <espaces>.)
     * @return renvoie la lettre Décodée (lettreDecodee)
     */
    static char decode(char lettre) {
        char lettreDecodee;
        if (lettre == 32){
            lettreDecodee = ' '; 
        } else {
            int a = g(lettre - 65);
            lettreDecodee = (char) (a + 65);
        }
        return lettreDecodee;
    }

    /**
     * Cette fonction Décode une chaine de caractères en une autre en faisant
     * appel à la fonction Decode()
     *
     * @param phraseADecrypter (Chaine de caractères comprenant que des lettres majuscule non accentuée et/ ou des <espaces>.)
     * @return renvoie la texte décrypté (messageDecrypte)
     */
    static String decrypte(String phraseADecrypter) {
        String messageDecrypte = "";

        for (int i = 0; i < phraseADecrypter.length(); ++i) {
            char c = phraseADecrypter.charAt(i);
            char lettreDecodee = decode(c);
            messageDecrypte = messageDecrypte + lettreDecodee;
        }

        return messageDecrypte;
    }

    /**
     * @return Affiche une ligne
     */
    static void ligne() {
        System.out.println("-------------------------------------------------");
    }

    /**
     * @param texteACoder Entrer le texte a crypter
     * @return Affiche le texte crypté
     */
    static void affichageCode(String texteACoder) {
        System.out.println("Le cryptage du message " + texteACoder + " est :");
        System.out.println(crypte(texteACoder) + "\n");
    }

    /**
     * @param texteADecoder Entrer le texte a décrypter
     * @return Affiche le texte décrypté
     */
    static void affichageDecode(String texteADecoder) {
        System.out.println("Le décodage du message " + texteADecoder + " est :");
        System.out.println(decrypte(texteADecoder) + "\n");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        ligne();
        System.out.println("-------------------CRYPTOLOGIE:------------------");
        System.out.println("-----------CODAGE ET DECODAGE D'UN TEXTE---------");
        ligne();

        affichageCode("PGCD");

        affichageDecode("RWEP");

        affichageCode("JAVA EST UN LANGAGE FORTEMENT TYPE");

        affichageDecode("DIFI AYJ UV ZIVWIWA LGNJAKAVJ JMRA");

        affichageDecode("YS ZA JABJA AYJ ZSYSTZA FGUY IFAX TSAV JNIFISZZA");
        
        
        ligne();
        ligne();
       
    
       System.out.println("Fin du programme");
       System.out.close();
    }
}


