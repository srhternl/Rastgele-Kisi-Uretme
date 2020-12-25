/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProje;



/**
 *
 * @author Serhat
 */
public class Yas {
    
    
    Rastgele rastgele = new Rastgele();
   
    public long yasUretici()
    {  
       long yas;
       yas= rastgele.rastgele2();
       return yas;
    }
    
     @Override
    public String toString() 
    {
       yasUretici();
       String ekran="";
       ekran += yasUretici() + ""; 
       return ekran;
    }
}
