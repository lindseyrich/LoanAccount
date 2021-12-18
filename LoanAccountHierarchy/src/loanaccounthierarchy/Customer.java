/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loanaccounthierarchy;
import java.util.*;

/**
 *
 * @author linds
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String SSN;
    private ArrayList<LoanAccountHierarchy> loanAccounts = new ArrayList();
    public Customer(String firstName, String lastName, String SSN){
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
               
    
    }
    public String getFirstName(){
        return this.firstName;
    
    }
    public String getLastName(){
    
        return this.lastName;
    }
    public String getSNN(){
        return this.SSN;
    
    }
    public ArrayList<LoanAccountHierarchy> addLoanAccount(LoanAccountHierarchy loan){
        
        loanAccounts.add(loan);
        return loanAccounts;
    }
    
    public String printMonthlyReport(){
        int val = 0;
        String customerSummary = "";
        while (loanAccounts.size() > val){
            
           customerSummary += loanAccounts.get(val);
           customerSummary += "\n";
           
           val++;
        }
        
        return String.format("Account Report for Customer: %s %s with SNN %s%s", this.getFirstName(), this.getLastName(), this.getSNN(), customerSummary);
    }
}
