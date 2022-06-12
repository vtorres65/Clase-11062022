package com.example.domain.lambda;

import java.util.List;
import java.util.Map;

/**
 *
 * @author oracle
 */
public class GroupTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        Map<String, List<SalesTxn>> tMap;
        
        // Print out transactions grouped by Buyer
        System.out.println("=== Transactions Grouped by Buyer ===");
        
    }
}
