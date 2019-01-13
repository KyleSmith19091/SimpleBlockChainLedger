/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleblockchain;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author KyleSmith
 */
public class FileEditor {
    
    private BufferedWriter writer;
    
    public FileEditor(){}
    
    public void writeToFile(String inFileName, String inData){
        try {
            writer = new BufferedWriter(new FileWriter(inFileName + ".txt", true));
            writer.newLine();
            writer.write(inData);
            writer.flush();
            
     
        } catch (IOException e) {
            System.out.println(e);
            System.exit(0);
        }
        
    }
    
}
