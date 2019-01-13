/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleblockchain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author KyleSmith
 */
public class ResLoader {
    
    private Scanner scFile;
    
    private ArrayList<String> resourcesFromFile = new ArrayList<>();
    
    private String[] fileNames = {"users.txt", "blockchain_hash_codes.txt", "transactions.txt"};
    
    public void LoadFile(String inFilename){
        
        try {
            scFile = new Scanner(new File(inFilename + ".txt"));
            System.out.println("File Loaded");
        } catch (FileNotFoundException e) {
            System.out.println(inFilename + ".txt cannot be found");
            System.exit(0);
        } 
        
        
        
    }
    
    public void DiscardFile(){
        scFile.close();
        scFile.reset();
    }
    
   public ArrayList<String> RetrieveData(){
       
       while(scFile.hasNext()) resourcesFromFile.add(scFile.nextLine());
       
       return resourcesFromFile;
       
   }
   
   
   
   
       
   
   
   
    
    
}
