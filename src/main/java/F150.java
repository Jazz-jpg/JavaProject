/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jazz
 */
public class F150 extends CarModel 
{
    
    //String TrimLevel = "King Ranch";
    // Service Notice Method
    //Constructor
    F150(int Year){
        super(Year);
        super.TrimLevel = "King Ranch";
        super.FuelType = "Diesel";
        super.BodyType = "Truck";
    
    }
    

    
    public String ServiceBulletin(){
        return null;
    }
}
