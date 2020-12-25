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
public class Kisi {
    
     private final RastgeleKisi yeniKisi = new RastgeleKisi();
     private final Yas yas = new Yas();
     private KimlikNo kimlik = new KimlikNo();
     private Telefon telefon = new Telefon();
     private final IMEINo imeiNo = new IMEINo();
     private String yazdir;
     
     public KimlikNo getKimlikNo()
     {
       return kimlik;
     }
     
     public void setKimlikNo(KimlikNo kimlik)
     {
         this.kimlik = kimlik;
     }
     
     public Telefon getTelefon()
     {
       return telefon;
     }
     
     public void setTelefon(Telefon telefon)
     {
         this.telefon = telefon;
     }

    public String kisiOlustur() 
    {
        yazdir = kimlik + " " + yeniKisi.rastgeleKisi() +  " " + yas + " " + telefon + " (" + imeiNo + ")";
        return yazdir;
    }
     
     public String kimlikKontrol(String KimlikNo) 
    {

        return kimlik.kimlikNoKontrol(KimlikNo);
         
    }

     public String imeiKontrol(String ImeiNo) 
    {
        
        return imeiNo.imeiNoKontrol(ImeiNo);
    }
}
