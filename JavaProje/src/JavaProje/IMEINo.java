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
public class IMEINo {
     Rastgele rastgele = new Rastgele();
     private final int imeiNo[] = new int[15];
    
     
    public int[] imeiNoUretici() 
    {
        int toplam=0, toplam1=0,toplam2=0,toplam3=0,toplam4=0,toplam5=0,toplam6=0,toplam7=0;
        int a,b,c,d,e,f,g;
        for (int i = 0; i < 15; i++) 
        {
            imeiNo[i] = (int) rastgele.rastgele();

        }
           //ImeiNo dizisinin 1,3,5,7,9,11 ve 13. elemanlarının toplamını bulan formül.
           for(int i=0; i<14; i+=2)
         {
           toplam = toplam + imeiNo[i];
         }    
        
         //IemiNo dizisinin 2,4,6,8,10,12,14. elemanlarını tutan değişkenler.
         a=imeiNo[1]*2; b=imeiNo[3]*2; c=imeiNo[5]*2; d=imeiNo[7]*2; e=imeiNo[9]*2; f=imeiNo[11]*2; g=imeiNo[13]*2;
        
         //Basamak değerlerini bulup, basamak değerlerinin toplamını buldurduğum while döngüleri.
           while (a != 0) 
        { 
           toplam1 = toplam1 + a % 10; 
           a = a/10; 
        }
           while (b != 0) 
        { 
           toplam2 = toplam2 + b % 10; 
           b = b/10; 
        } 
           while (c != 0) 
        { 
           toplam3 = toplam3 + c % 10; 
           c = c/10; 
        } 
           while (d != 0) 
        { 
           toplam4 = toplam4 + d % 10; 
           d = d/10; 
        } 
        
           while (e != 0) 
        { 
           toplam5 = toplam5 + e % 10; 
           e = e/10; 
        } 
           while (f != 0) 
        { 
           toplam6 = toplam6 + f % 10; 
           f = f/10; 
        } 
           while (g != 0) 
        { 
           toplam7 = toplam7 + g % 10; 
           g = g/10; 
        } 
         
            
          //Dizinin son elemanını bulan formül.
           imeiNo[14] = (1000000000 - (((toplam) +(toplam1+toplam2+toplam3+toplam4+toplam5+toplam6+toplam7) )))%10;
          
        return imeiNo;
    }

   public String imeiNoKontrol(String ImeiNo) {
        int sonBasamak,h,j,k,l,m,n,o;
        int toplam8=0, toplam9=0,toplam10=0,toplam11=0,toplam12=0,toplam13=0,toplam14=0,toplam15=0;
        
        int imeiNo2[] = new int[ImeiNo.length()];

        if (ImeiNo.length() != 15) {
            return "Geçersiz Imei No";
        }
        for (int i = 0; i < ImeiNo.length(); i++) {
             imeiNo2[i] = Integer.parseInt(ImeiNo.substring(i, i + 1));
        }
        
          
        //ImeiNo dizisinin 1,3,5,7,9,11 ve 13. elemanlarının toplamını bulan formül.
           for(int i=0; i<14; i+=2)
         {
           toplam8 = toplam8 + imeiNo2[i];
         }    
        
         //IemiNo dizisinin 2,4,6,8,10,12,14. elemanlarını tutan değişkenler.
         h=imeiNo2[1]*2; j=imeiNo2[3]*2; k=imeiNo2[5]*2; l=imeiNo2[7]*2; m=imeiNo2[9]*2; n=imeiNo2[11]*2; 
         o=imeiNo2[13]*2;
        
         //Basamak değerlerini bulup toplamını buldurduğum while döngüleri.
           while (h != 0) 
        { 
           toplam9 = toplam9 + h % 10; 
           h = h/10; 
        }
           while (j != 0) 
        { 
           toplam10 = toplam10 + j % 10; 
           j = j/10; 
        } 
           while (k != 0) 
        { 
           toplam11 = toplam11 + k % 10; 
           k = k/10; 
        } 
           while (l != 0) 
        { 
           toplam12 = toplam12 + l % 10; 
           l = l/10; 
        } 
        
           while (m != 0) 
        { 
           toplam13 = toplam13 + m % 10; 
           m = m/10; 
        } 
           while (n != 0) 
        { 
           toplam14 = toplam14 + n % 10; 
           n = n/10; 
        } 
           while (o != 0) 
        { 
           toplam15 = toplam15 + o % 10; 
           o = o/10; 
        } 
         
          //Dizinin son elemanını bulan formül.
           sonBasamak = (1000000000 - (((toplam8) +(toplam9+toplam10+toplam11+toplam12+toplam13+toplam14+toplam15))))%10;
          
       
        if ( imeiNo2[14] == sonBasamak) 
        {
            return "Geçerli Imei No";
        } 
        else 
        {
            return "Geçersiz Imei No";
        }
    }
    
      @Override
    public String toString() 
    {
       imeiNoUretici();
       String ekran="";
       for(int numara : imeiNo)
       {
        ekran += numara + "";
       }
       return ekran;
    }
}
