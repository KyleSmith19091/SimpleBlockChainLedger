/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleblockchain;

import java.util.Arrays;

public class Block {
    
    private int iPreviousHash;
    //List of transactions associated with this block
    private String[] transactions;
    
    //Hashcode for the entire block
    private int blockHash;
    
    public Block(int inPreviousHash, String[] inTransactions){
        this.iPreviousHash = inPreviousHash;
        this.transactions = inTransactions;
        
        //Populate array with transaction and previous hashcode to calculate new hash 
        Object[] contents = {Arrays.hashCode(transactions), inPreviousHash};
        this.blockHash = Arrays.hashCode(contents);
    }
    
    

    public int getiPreviousHash() {
        return iPreviousHash;
    }

    public void setiPreviousHash(int iPreviousHash) {
        this.iPreviousHash = iPreviousHash;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public void setTransactions(String[] transactions) {
        this.transactions = transactions;
    }
    
    public int getBlockHash(){
        return blockHash;
    }
    
    
    
    
    
}
