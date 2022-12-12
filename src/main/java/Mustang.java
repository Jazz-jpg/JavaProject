/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jazz
 */
public class Mustang extends CarModel {
    
    String Engine = "5.0";
    
    // Create Service Notice Method
    //Constructor
    Mustang(int Year){
        super(Year);
        super.BodyType = "Muscle Car";
        super.FuelType = "Gas";
        super.TrimLevel = "GT";
    }
    
    public void SetEngine(String Engine){
        this.Engine = Engine;
    }
    
    public String GetEngine(){
        return Engine;
    }
    
    public String ServiceBulletin(){
        return null;
    }
    
}
