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
public class Telefon {
     Rastgele rastgele = new Rastgele();
     private final int Telefon[] = new int[11];

    public int[] telefonNumarasiUretici() 
    {   int a;
      
        Telefon[0] = 0;
        Telefon[1] = 5;
        Telefon[2] = (int) rastgele.rastgele4();
        
         for ( a = 3; a < 11; a++) 
        {
            Telefon[a] = (int) rastgele.rastgele3();
        }
         return Telefon;
    }
    
     @Override
    public String toString() 
    {
       telefonNumarasiUretici();
       String ekran="";
       for(int numara : Telefon)
       {
         ekran += numara + "";
       }
       return ekran;
    }
}
