/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleblockchain;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author KyleSmith
 */
public class MyBlockchain {

    public static void main(String[] args){
        //Entry point
        ResLoader res = new ResLoader();
        FileEditor fileEditor = new FileEditor();
        ArrayList<Block> arrlBlockchain = new ArrayList<>();
        ArrayList<String> transactionsForSession = new ArrayList<>();
       
        while(true){
         transactionsForSession.add(JOptionPane.showInputDialog("Enter The Transaction You Would Like To Perform!"));
         if(transactionsForSession.get(transactionsForSession.size()-1).equalsIgnoreCase("Done")) break;
        }
        
        System.out.println("Setting up file to add Block!");
        
        res.LoadFile("block_chain_hash_codes");
        
        //Get previous hashcode for previous block for calculation of new block
        int iPreviousHash = Integer.parseInt(res.RetrieveData().get(res.RetrieveData().size()-1));
        
        //Convert ArrayList to String[]
        String[] hashCodeDataSession = new String[transactionsForSession.size()];
        hashCodeDataSession = transactionsForSession.toArray(hashCodeDataSession);
        
        //Transaction session is done -- add the transactions to a new block
        Block blockSession = new Block(iPreviousHash, hashCodeDataSession);
                
        //Write block hash codes to hash code file
        fileEditor.writeToFile("block_chain_hash_codes", "" + blockSession.getBlockHash());
        
        //Reload the hashcode file
        res.LoadFile("block_chain_hash_codes");
        
        //Display all hashcodes
        System.out.println("Transactions ----->");
        for (int i = 0; i < res.RetrieveData().size(); i++) {
            
            System.out.println(res.RetrieveData().get(i));
            
        }
        
        
         
        
        
    
        
        
        
        
    }
    
}
