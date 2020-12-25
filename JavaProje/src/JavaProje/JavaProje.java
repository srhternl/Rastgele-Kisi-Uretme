/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProje;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Serhat
 */
public class JavaProje {

    /**
     * @param args the command line arguments
     */
    
    private static final Scanner giris = new Scanner(System.in);
    private static final Kisi kisi = new Kisi();
    private static int secim = 0;
    private static int kisiSayisi;
    
    public static void main(String[] args) throws IOException {
       
       
            while (secim != 3) 
            {
            Secim();
            switch (secim) 
            {

                case 1:
                    dosyayiTemizle();
                    rastgeleKisiUret(kisiSayisi);
                    break;

                case 2:
                    kontrolMekanizması();
                    break;
                default:
                    System.out.println("Çıkış Yapıldı...");
                    break;
            }

           }
    }
    
      public static void Secim() {

        System.out.println("1 - Rastgele Kişi Üret\n2 - Üretilmiş Dosya Kontrol Et\n3 - Çıkış");
        System.out.print("Seçiminiz :");
        secim = giris.nextInt();

        while (secim < 1 || secim > 3) 
        {
            System.out.println("Lütfen Geçerli Değerler Giriniz!\n1 - Rastgele Kişi Üret\n2 - Üretilmiş Dosya Kontrol Et\n3 - Çıkış");
            System.out.print("Seçiminiz :");
            secim = giris.nextInt();
        }
        if (secim == 1) 
        {
            System.out.print("Üretilecek Kişi Sayısı :");
            kisiSayisi = giris.nextInt();
        }

    }

    public static void rastgeleKisiUret(int sayi) throws FileNotFoundException, IOException {

        for (int i = 0; i < sayi; i++) 
        {

            String kayıt = kisi.kisiOlustur();

            File file = new File("Kisiler.txt");
            if (!file.exists()) 
            {
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file, true);
            try (BufferedWriter bWriter = new BufferedWriter(fileWriter)) 
            {
                bWriter.write(kayıt);
                bWriter.newLine();
            }
        }
        System.out.println("Kayıt Eklendi...");

    }

    public static void kontrolMekanizması() throws FileNotFoundException, IOException 
    {

        FileReader fileReader = new FileReader("Kisiler.txt");
        String line;
        
        try (BufferedReader okuma = new BufferedReader(fileReader)) 
        {
            int gecerliKimlikNo = 0, gecersizKimlikNo = 0, gecerliImeiNo = 0, gecersizImeiNo = 0;
            while ((line = okuma.readLine()) != null) 
            {
                String[] Bilgiler = line.split(" ");

               
                if ("Geçerli Tc Kimlik Numarası".equals(kisi.kimlikKontrol(Bilgiler[0]))) 
                {
                    gecerliKimlikNo++;
                } 
                else if ("Geçersiz Tc Kimlik Numarası".equals(kisi.kimlikKontrol(Bilgiler[0])))
                {
                    gecersizKimlikNo++;
                }

               if ("Geçerli Imei No".equals(kisi.imeiKontrol(Bilgiler[5].substring(1, Bilgiler[5].length() -1)))) 
               {
                    gecerliImeiNo++;
               } 
               else if ("Geçersiz Imei No".equals(kisi.imeiKontrol(Bilgiler[5].substring(1, Bilgiler[5].length() - 1)))) 
               {
                    gecersizImeiNo++;
                
               }
            }
            System.out.println("\nT.C Kimlik Kontrol\n" + gecerliKimlikNo + " Geçerli\n" + gecersizKimlikNo + " Geçersiz");
            System.out.println("\nIMEI Kontrol\n" + gecerliImeiNo + " Geçerli\n" + gecersizImeiNo + " Geçersiz\n");
        }
        

    }
    
    public static void dosyayiTemizle()
    {
      File file = new File("Kisiler.txt");
      file.delete();
       
    }
        
}
    

