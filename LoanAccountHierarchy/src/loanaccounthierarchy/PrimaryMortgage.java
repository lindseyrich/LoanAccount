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
public class PrimaryMortgage extends LoanAccountHierarchy {
    
    private double PMIMonthlyAmount;
    private Address propertyAddress;
    public PrimaryMortgage(double principle, double annualInterestRate, int months, double PMIMonthlyAmount, Address propertyAddress ){
     super(principle, annualInterestRate, months);
     this.PMIMonthlyAmount = PMIMonthlyAmount;
     this.propertyAddress = propertyAddress;
     
     
}
    public double getPMIMonthlyAmount(){
        return this.PMIMonthlyAmount;
    }
    
    public Object getPropertyAddress(){
        return this.propertyAddress;
    }
    @Override
    public String toString(){

        return String.format("Primary Mortgage Loan with: \n%sPMI Monthly Amount: $%s\n%s", super.toString(),this.getPMIMonthlyAmount(),this.getPropertyAddress());
}   
    
}
