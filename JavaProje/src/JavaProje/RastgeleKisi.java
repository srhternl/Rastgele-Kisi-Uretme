/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProje;

import java.io.*;

/**
 *
 * @author Serhat
 */
public class RastgeleKisi {
   	// Üretilen Kişiler Metin belgesine Kayıt Edilip Üretilen Kişilerdeki TC Imei Numaraları Geçerlimi Diye Kontrol Edilip Ekrana Yazdırılmaktadır.
   
    Rastgele rastgele = new Rastgele();
    private int satirSayisi;
    private File file;
    private BufferedReader reader = null;

    public String rastgeleKisi()
    {
         file = new File("..\\JavaProje\\random_isimler.txt");
              
         satirSayisi = 0;
      try 
     {
         reader = new BufferedReader(new FileReader(file));
         String satir = reader.readLine();
         while (satir != null)
         {
           if (satir.length() > 0)
           {
              satirSayisi++;
           }
              satir = reader.readLine();
         }
     } 
      catch (final IOException e) 
     {
     }
         int sayac = 0;
         String metin[] = new String[satirSayisi + 1];
         try 
        {
             reader= new BufferedReader(new InputStreamReader(new FileInputStream(file)));
             metin[0] = reader.readLine();
             while (metin[sayac] != null) 
            {
                if (metin[sayac].length() > 0) 
                {
                    sayac++;
                }
                metin[sayac] = reader.readLine();
            }
            reader.close();
        } 
         catch (FileNotFoundException ex) 
        {
        } 
         catch (IOException ex) 
        {
        }
         satirSayisi=(int) rastgele.rastgele3();
         return metin[satirSayisi];
    
    }
    
}
