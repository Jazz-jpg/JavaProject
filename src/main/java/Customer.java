/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jazz
 */
public class Customer {
    
    String Name;
    String Car;
    String Dealership;
    String Issue;
    String ServiceDate;
    int PhoneNumber;
    
    
    
    //Constructor
    Customer(String Name, String Car, String Dealership, String Issue, String ServiceDate, int PhoneNumber){
        this.Name = Name;
        this.Car = Car;
        this.Dealership = Dealership;
        this.Issue = Issue;
        this.ServiceDate = ServiceDate;
        this.PhoneNumber = PhoneNumber;
    }
    
    
    //setters
    public void SetName(String Name){
        this.Name = Name;
    }
    public void setCar(String Car){
        this.Car = Car;
    }
    public void setDealership(String Dealership){
        this.Dealership = Dealership;
    }
    public void setIssue(String Issue){
        this.Issue = Issue;
    }
    public void setServiceDate(String ServiceDate){
        this.ServiceDate = ServiceDate;
    }
    public void setPhoneNumber(int PhoneNumber){
        this.PhoneNumber = PhoneNumber;
    }
    
    //Getters
    
    public String getName(){
        return Name;
    }
    public String getCar(){
        return Car;
    }
    public String getDealership(){
       return Dealership; 
    }
    public String getIssue(){
       return Issue; 
    }
    public String getServiceDate(){
        return ServiceDate;
    }
    public Integer GetPhoneNumber(){
        return PhoneNumber;
    }
}
