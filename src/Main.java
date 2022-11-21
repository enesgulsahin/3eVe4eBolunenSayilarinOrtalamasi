import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int sayi, toplam = 0, ortalama = 0, toplamSayi =0;
        System.out.print("Bir sayı giriniz : ");
        sayi = inp.nextInt();
        for(int i = 1; i <= sayi; i++){
            if(i % 12 == 0){
            System.out.println(i);
            toplam += i;
            toplamSayi++;
            ortalama = toplam/toplamSayi;
            }
        } System.out.println("Sayıların Ortalaması = " + ortalama );
    }
}