/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loanaccounthierarchy;

/**
 *
 * @author linds
 */
public class UnsecuredLoan extends LoanAccountHierarchy{
    public UnsecuredLoan(double principle, double annualInterestRate, int months){
        super(principle, annualInterestRate, months);
    
    }
    @Override
    public String toString(){
        return String.format("Unsecured Loan with: \n%s",super.toString());
    }   
    
}
