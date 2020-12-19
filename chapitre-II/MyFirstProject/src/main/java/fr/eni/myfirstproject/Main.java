/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.myfirstproject;

/**
 * la classe Main est la classe principale du projet contenant le point d'entrée
 * de l'application.
 *
 * @author Romain Lemouneau
 * @version 1.0
 */
public class Main {

    /**
     * Méthode principale de l'application (point d'entrée).
     *
     * @param args : paramètre d'entrée
     */
    public static void main(String[] args) {
        /**
         * Instance de la classe HelloWorld
         *
         * @see HelloWorld
         */
        HelloWorld myObj = new HelloWorld();
        HelloWorld.afficheLog(myObj.getChaine());
        HelloWorld.afficheConsole(myObj.getChaine());
    }

}
