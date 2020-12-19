package fr.eni.calculgeometrique;

/**
 * Classe Carre contenant hérite de la classe mère Rectangle.
 * 
 * @author Romain
 * @version 1.0
 */
public class Carre extends Rectangle{

    /**
     * Constructeur d'un carré basé sur le constructeur de la classe Rectangle.
     * @param cote : côté du carré à créer
     */
    public Carre (int cote){	
        super(cote, cote);	
    }
    
}
