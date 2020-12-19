package fr.eni.myfirstproject;

import java.util.logging.Logger;

/**
 * La classe HelloWorld représente une chaine de caractères pouvant être
 * affichée dans la console ou dans une log.
 *
 * @author Romain Lemouneau
 * @version 2.0
 */
public class HelloWorld {

    /**
     * @serial La chaine de caractères à logger.
     */
    private String chaine;

    //chaine="Hello World !";
    /**
     * Affiche une chaîne de caractères dans la console
     *
     * @param param1 : chaîne de caractères à afficher
     * @deprecated la version 2.0 de HelloWorld, remplacée par afficheLog
     */
    @Deprecated
    public static void afficheConsole(String param1) {
        System.out.println(param1);
    }

    /**
     * Affiche une chaîne de caractères dans le fichier de log
     *
     * @param param1 : chaîne de caractères à afficher
     */
    public static void afficheLog(String param1) {
        Logger.getLogger(param1);
    }

    /**
     * Retourne l'attribut privé chaine
     *
     * @return une instance de l'attribut chaine
     */
    public String getChaine() {
        return chaine;
    }

    /**
     * Met à jour l'attribut chaine.
     *
     * @param chaine : paramètre d'entrée
     * @since 2.0
     */
    public void setChaine(String chaine) {
        this.chaine = chaine;
    }
}
