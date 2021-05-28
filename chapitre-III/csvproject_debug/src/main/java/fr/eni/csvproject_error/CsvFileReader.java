/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.csvproject_error;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author rlemo
 */
public class CsvFileReader {  
    
    public static void main(String[] args) {
       
       String line;
       String output;
       String cvsSplitBy = ";";
       String csvFile = "\\src\\main\\resources\\csv\\addresses.csv";

       try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

           while ((line = br.readLine()) != null) {

               String[] address = line.split(cvsSplitBy);
               output = "First name: " + address[0] + ", Name: " + address[1] + ", Address: " + address[2] + " " + address[3] + " " +
                       address[4] + " " + address[5];
               System.out.println(output);
           }

       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
