/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

/**
 *
 * @author user
 */

public class laundry {
   public static String Harga;
    public static int a =0;
    public String jenis( Object Jenis){
       
         String flag ;
       if (Jenis == "Baju"){
            Harga= "5000";
            a = 1;
            flag="5000";
            
        }
        else if (Jenis =="Gorden"){
             Harga= "20000";
       
            a = 2;
             flag="20000";
        }
        else if (Jenis =="Boneka"){
            Harga= "8000";
      
            a = 3;
             flag="8000";
                }
        else if (Jenis =="Jas"){
             Harga= "18000";

            a=4;
             flag="18000";
                }else{
             flag="fail";
            
        } return flag;
    }
    public String kategori( Object category,Object Jenis){
        String flag = null ;
        
        if(Jenis == "Baju"){
                if(category =="Cuci + Kering + Setrika"){
                   Harga= "8000";
                   flag="8000";
                }else if(category =="Cuci + Kering"){
                    Harga= "7000";
                    flag="7000";
                }else{
                    Harga= "6000";
                    flag="6000";
                }
        }
        else if(Jenis == "Gorden"){ 
                if(category=="Cuci + Kering + Setrika"){
                    Harga= "28000";
                    flag="28000";
                }else if(category =="Cuci + Kering"){
                    Harga= "27000";
                    flag="27000";
                }else{
                    Harga= "26000";
                    flag="26000";
                }
        }
                
           else if(Jenis == "Boneka"){ 
                if(category=="Cuci + Kering + Setrika"){
                    Harga= "16000";
                    flag="16000";
                }else if(category =="Cuci + Kering"){
                    Harga= "15000";
                    flag="15000";
                }else{
                    Harga= "14000";
                    flag="14000";
                }
           }
              
               else if(Jenis == "Jas"){  
                if(category=="Cuci + Kering + Setrika"){
                   Harga= "26000";
                   flag="26000";
                }else if(category =="Cuci + Kering"){
                    Harga= "25000";
                    flag="25000";
                }else{
                    Harga= "24000";
                    flag="24000";
                }
                       }
                       
        return flag;
    
    
}
    }
