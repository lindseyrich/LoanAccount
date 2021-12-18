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
public class Address {
    private String street;
    private String city;
    private String state;
    private String zipcode;
    public Address(String street, String city, String state, String zipcode){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    
    }
    
    public String getStreet(){
        return this.street;
        
    }
    public String getCity(){
    
        return this.city;
    }
    public String getState(){
    
        return this.state;
        
    }
    public String getZipcode(){
    
        return this.zipcode;
    }
    
    public String toString(){
    
        return String.format("Property Address: \n %s\n %s, %s %s\n", this.getStreet(), this.getCity(), this.getState(), this.getZipcode());
    }
}
