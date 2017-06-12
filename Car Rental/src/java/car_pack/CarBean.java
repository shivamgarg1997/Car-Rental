/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_pack;
import java.sql.Date;
import profile_pack.*;
import user_pack.*;
public class CarBean implements serializable{
    private String owner;
    Date fromdate,todate;
    
    public void setowner(String name){ 
        owner = name; 
    }
    public void setfromdate(Date fdate){
        fromdate = fdate; 
    }
    public void settodate(Date tdate){ 
        fromdate = tdate; 
    }
    public Date getfromdate(){ 
        return fromdate; 
    }
    public Date gettodate(){
        return todate; 
    }
    
}
