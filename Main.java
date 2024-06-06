import java.util.Scanner;

/*

İdman Oluşturma Programı Yapalım.


Idman -> Class ı olustur.
>İçerisine ÖZelliklerini tanımla.  ( private ..) Constructor ve setter-getter yapalım
>Metodunu Oluştur. hareketYap
> hareketYap metodunun icerisindeki metodları yaz.
>İdmanın bitip bitmediğine dair metod yaz ( public boolean ile)

 */
public class Main {

    public static void main ( String [] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("İdman Programına Hoşgeldiniz..");

        System.out.println("***********************");

        String idmanlar = "Geçerli Hareketler..\n"
                + "Burpee\n"
                + "PushUp(Şınav)\n"
                + "Situp(mekik) \n"
                +"Squat";

        System.out.println(idmanlar);

        System.out.println("Bir İdman Oluşturunuz...");
        System.out.print("Burpee Sayisi: ");
        int burpee = scanner.nextInt();
        System.out.print("PushUp Sayisi: ");
        int pushup = scanner.nextInt();
        System.out.print("Situp Sayisi: ");
        int situp = scanner.nextInt();
        System.out.print("Squat Sayisi: ");
        int squat = scanner.nextInt();
        scanner.nextLine();



        Idman idman=new Idman(burpee,pushup,situp,squat);

        System.out.println("İdman Başlıyor..");

        while (idman.idmanBittimi() == false) {

            System.out.print("Hareket Türü (Burpee,PushUp,Situp,Squat) : ");
            String tur = scanner.nextLine();

            System.out.println("Bu Hareketten Kaç Tane Yapacaksınız? : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();


            idman.hareketYap(tur,sayi);



        }

        System.out.println("İdmanınızı Başarıyla Tamamladınız, tebrikler!!..");



    }
}
