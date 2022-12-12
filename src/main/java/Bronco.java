/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jazz
 */
public class Bronco extends CarModel {
    
    
    //Service notice Method
    //Constructor
    Bronco(int Year){
        super(Year);
        super.BodyType = "SUV";
        super.FuelType = "Gas";
        super.TrimLevel = "OffRoad";
    }
    
    
    public String ServiceBulletin(){
        return null;
    }
    
}
