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
public class  KimlikNo {
    
    Rastgele rastgele = new Rastgele();
    private final int tcKimlik[] = new int[11];
   
    
   
    @SuppressWarnings("empty-statement")
    public int[] kimlikNoUretici() 
    {     int sayac=0;
          int toplam=0;
          int toplam2=0;
          int toplam3=0;
         
          for ( sayac = 0; sayac < 11; sayac++) 
        {
            if(sayac==0)
            {
              tcKimlik[0] = (int) rastgele.rastgele();
            }
            else if(sayac<10)
            {
               tcKimlik[sayac] = (int) rastgele.rastgele();
            }

        }
         //TcKimlik dizisindeki 1,3,5,7 ve 9. elemanların toplamını veren döngü.
         for(int i=0; i<9; i+=2)
        {
            toplam= toplam + tcKimlik[i];
        }
         
         //TcKimlik dizisindeki 2,4,6 ve 8. elemanların toplamını veren döngü.
          for(int i=1; i<8; i+=2)
        {
            toplam2= toplam2 + tcKimlik[i];
        }
          //TcKimlik dizisinin 10. elemanını bulan formül.
          tcKimlik[9] = ((toplam * 7) - (toplam2)) % 10;
                        
          //TcKimlik dizisindeki son elemanı bulmamı sağlayan toplam değişkenini bulan döngü.
          for(int i=0; i<10; i++)
        {
           toplam3 = toplam3 + tcKimlik[i];     
        }
           //TcKimlik dizisinin son elemanını bulan formül.
           tcKimlik[10] = (toplam3) %10;
           return tcKimlik;
    }

    public String kimlikNoKontrol(String TcNo) 
    {   int basamak10, basamak11;
        int toplam4=0,toplam5=0,toplam6=0;
        int tcKimlik2[] = new int[TcNo.length()];
        if (TcNo.length() != 11) 
        {
            return "Geçersiz Tc Kimlik Numarası";
        }
        
        for (int i = 0; i < TcNo.length(); i++) 
        {
            tcKimlik2[i] = Integer.parseInt(TcNo.substring(i, i + 1));
        }
        
       
      //TcKimlik dizisindeki 1,3,5,7 ve 9. elemanların toplamını veren döngü.
         for(int i=0; i<9; i+=2)
        {
            toplam4= toplam4 + tcKimlik2[i];
        }
         
         //TcKimlik dizisindeki 2,4,6 ve 8. elemanların toplamını veren döngü.
          for(int i=1; i<8; i+=2)
        {
            toplam5= toplam5 + tcKimlik2[i];
        }
         
         basamak10 = ((toplam4 * 7) - (toplam5)) % 10;
        
         for(int i=0; i<10; i++)
        {
           toplam6 = toplam6 + tcKimlik2[i];     
        }
         basamak11 = (toplam6) %10;
                     
        
        if (tcKimlik2[9] == basamak10 && tcKimlik2[10] == basamak11)
        {
            return "Geçerli Tc Kimlik Numarası";
        } 
        else 
        {
            return "Geçersiz Tc Kimlik Numarası";
        }
    }
    
     @Override
    public String toString() {
       kimlikNoUretici();
       String ekran="";
       for(int numara : tcKimlik)
       {
         ekran += numara + "";
       }
       return ekran;
    }
   
}
