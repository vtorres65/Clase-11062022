package com.example.domain.lambda;

import java.util.List;

/**
 *
 * @author oracle
 */
public class CollectTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        List<SalesTxn> rList;
        
        // Print out Transactions over $300k
        System.out.println("=== Transactions over $300k ===");
        rList = tList; // Replace with sorting stream and collect            
        
        rList.stream()
            .forEach( t -> 
                System.out.printf(
                    "Id: " + t.getTxnId() + " Seller: " + t.getSalesPerson() + 
                    " Buyer: " + t.getBuyerName() +
                    " Amt: $%,9.2f%n", t.getTransactionTotal()
                )
            );
        
        
    }
}