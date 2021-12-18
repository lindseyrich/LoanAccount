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
public class LoanAccountHierarchy {

    private double principle;
    private double annualIntrestRate;
    private int months;
    public LoanAccountHierarchy(double principle, double annualInterestRate, int months){
        this.principle = principle;
        this.annualIntrestRate = annualInterestRate; 
        this.months = months;
        
    }
    
     public double getPrinciple(){
        return this.principle;
    }
     
    public double getAnnualInterestRate(){
        return this.annualIntrestRate;
        
    }
  
    public int getMonths(){
        return this.months;
        
    }
    public double calculateMonthlyPayment(){
   
        double x = (this.getAnnualInterestRate() / 100);
        double monthlyInterest = x/12;
        double monthlyPayment = this.principle * ( monthlyInterest / (1 - Math.pow(1 + monthlyInterest, -this.getMonths())));
        return monthlyPayment;
    }
    
    public String toString() {
        return String.format("Principle: $%.2f\nAnnual Interest Rate: %.2f%%\nTerm of Loan in Months: %d\nMonthly Payment: $%.2f\n", this.getPrinciple(), this.getAnnualInterestRate(), this.getMonths(), this.calculateMonthlyPayment());
    
    }
    
    
    
    public static void main(String[] args) {
     
        CarLoan carLoan1 = new CarLoan(25000.00, 4.9, 72, "IRQ3458977");
        CarLoan carLoan2 = new CarLoan(12000.00, 5, 60, "NXK6767876");
       
        Address propertyAddress1 = new Address("321 Main Street", "State College", "PA", "16801");
        
        
        PrimaryMortgage propertyLoan1 = new PrimaryMortgage(250000.00, 3.75, 360, 35.12, propertyAddress1);
        Address propertyAddress2 = new Address("783 Maple Lane", "State College", "PA", "16801");
        PrimaryMortgage propertyLoan2 = new PrimaryMortgage(375000.00, 2.5, 360, 53.12, propertyAddress2);
        
        UnsecuredLoan unsecuredLoan = new UnsecuredLoan(5000.00, 10.75, 48);
        Customer customerA = new Customer("Tony", "Stark", "111-22-3333");
        Customer customerB = new Customer("Gal", "Gadot", "444-55-6666");
        customerA.addLoanAccount(carLoan1);
        customerA.addLoanAccount(propertyLoan1);
        customerA.addLoanAccount(unsecuredLoan);
        customerB.addLoanAccount(carLoan2);
        customerB.addLoanAccount(propertyLoan2);
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(customerA);
        customers.add(customerB);
        System.out.println("Monthly Report of Customers by Loan Account");
        for(Customer customer:customers){
            System.out.print(customer.printMonthlyReport());
        }

       // System.out.format("%s\n%s\n%s", carLoan, propertyLoan, unsecuredLoan);
       
    }
    
}
