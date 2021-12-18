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
public class CarLoan extends LoanAccountHierarchy {
    private String vehicleVIN; 
    public CarLoan(double principle, double annualInterestRate, int months, String vehicleVIN){
        super(principle, annualInterestRate, months);
        this.vehicleVIN = vehicleVIN;
    }
    
    public String getVIN(){
        return this.vehicleVIN;
    }
    @Override
    public String toString(){
    return String.format("\nCar Loan with: \n%sVehicle VIN: %s\n",super.toString(), this.getVIN());
    }
    
    
    
}
