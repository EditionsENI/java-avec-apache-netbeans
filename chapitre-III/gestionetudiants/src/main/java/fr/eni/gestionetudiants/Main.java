/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.gestionetudiants;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author rlemo
 */
public class Main {
    
    public static void main(String []args) {
        
        try {
            Matiere sciences = new Matiere("Physique", "Chimie", "Mathématique");
            Matiere langues = new Matiere("Espagnol", "Italien", "Anglais");
            
            Etudiant etudiant1 = new Etudiant("Pierre", "Durant", sciences);            
            Etudiant etudiant2 = (Etudiant) etudiant1.clone();

            System.out.println(etudiant1);
            System.out.println(etudiant1.hashCode());
            System.out.println(etudiant2);
            System.out.println(etudiant2.hashCode());            
            
            etudiant2.setMatieres(langues);
            System.out.println(etudiant2);
            System.out.println(etudiant2.hashCode());
                        System.out.println(etudiant1);
            System.out.println(etudiant1.hashCode());
            
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
