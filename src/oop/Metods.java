package oop;

public class Metods {
    public static void main(String[] args) {

        // Bir Metod altına aynı ekrandaki diğer metodları bağlayabilirsin.
        System.out.println("Metod Bağlantıları");

        int sonuc = makine(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        System.out.println(sonuc);
        makine();

        String neresi = sehirNe();
        System.out.println(neresi);

        // Metodun işlemleri kendi bloğunda gerçekleşse bile *main de bağlantısı olmalı.
        sayiBulmaca();
    }

    public static void sayiBulmaca() {

        int[] torba = new int[] { 2, 3, 5, 7 };
        int rakam = 2;
        boolean netice = false;

        for (int i : torba) {
            if (i == rakam) {
                netice = true;
                break;
            }
        }

        if (netice) {
            System.out.println("var");
        } else {
            System.out.println("yok");
        }

    }

    public static int makine(int... hesapMakinesi) {

        int toplam = 0;
        for (int sayi : hesapMakinesi) {
            toplam += sayi;
        }
        return toplam;
    }

    public static String sehirNe() {

        return "istanbul";
    }

}