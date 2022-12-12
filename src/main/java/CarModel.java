/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jazz
 */
public abstract class CarModel {
    
    int Year;
    String Brand = "Ford";
    String FuelType;
    String BodyType;
    String TrimLevel;
    
    //Service bulletin abstract method
    
    //Constructor
    CarModel(int Year){
        this.Year = Year;
        
    }
    
    
    //Setters
    public void SetYear(int Year){
        
        this.Year = Year;
    }
    public void SetBrand(String Brand){
        this.Brand = Brand;
    }
    public void SetFuelType(String FuelType){
        this.FuelType = FuelType;
    }
    public void SetBodyType(String BodyType){
        this.BodyType = BodyType;
    }
    public void SetTrimLevel(String TrimLevel){
        this.TrimLevel = TrimLevel;
    }
    
    
    //Getters
    public Integer GetYear(){
        return Year;
    }
    public String GetBrand(){
        return Brand;
    }
    public String GetFuelType(){
        return FuelType;
    }
    public String GetBodyType(){
        return BodyType;
    }
    public String GetTrimLevel(){
        return TrimLevel;
    }
    
    //Unimplemented Service Bulletin Function
    abstract public String ServiceBulletin();

}
