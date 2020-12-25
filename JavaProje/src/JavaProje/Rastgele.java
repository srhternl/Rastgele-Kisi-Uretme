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
public class Rastgele {
     long a,b,c;
    //Tek basamaklı sayı üreten sınıf.
    public long rastgele()
    {
       
         a= ((System.nanoTime()/100)%10);
         
         if(a==0)
         {
           return 7;
         }
         else
             
         {
             return (int) a;
         }
    }
    
    //Hem tek hem çift basamaklı sayı üreten fonksiyon.
    public long rastgele2()
    {
         
         a= ((System.nanoTime()/100));
         b= ((System.nanoTime()/100));
         a=a/10;
         c=(a-((a/10)*10))*10 + (b-(b/10)*10);     
        
         if(c == 0)
        {
         return 1;
        }
         return  c;   
    }
      //0 dan 9 a kadar 0 da dahil rastgele rakam üreten fonksiyon.    
    public long rastgele3()
    {
         a= ((System.nanoTime()/100)%10);
         
         return (int) a;
    }
    //Telefon numarasının 3.rakamını üreten fonksiyon.
    public long rastgele4()
    {
       
         a= ((System.nanoTime()/100)%10);
         
         if(a==0 || a==1 || a==2)
         {
           return 3;
         }
          if(a==6 || a==7)
         {
           return 4;
         }
           if(a==8 || a==9)
         {
           return 5;
         }
         else
             
         {
             return (int) a;
         }
 
    }   
}
