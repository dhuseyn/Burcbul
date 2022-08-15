/*
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int day, month;

        System.out.print("Doğduğunuz ay (1-12) : ");
        Scanner inp = new Scanner(System.in);
        month = inp.nextInt();
        System.out.print("Doğduğunuz gün (1-31) : ");
        day = inp.nextInt();

        if ((month==3 && day>20) || (month==4 && day<21)) System.out.println("Koç burcusunuz...");
        else if ((month==4 && day>20) || (month==5 && day<22)) System.out.println("Boğa burcusunuz...");
        else if ((month==5 && day>21) || (month==6 && day<23)) System.out.println("İkizler burcusunuz...");
        else if ((month==6 && day>22) || (month==7 && day<23)) System.out.println("Yengeç burcusunuz...");
        else if ((month==7 && day>22) || (month==8 && day<23)) System.out.println("Aslan burcusunuz...");
        else if ((month==8 && day>22) || (month==9 && day<23)) System.out.println("Başak burcusunuz...");
        else if ((month==9 && day>22) || (month==10 && day<23)) System.out.println("Terazi burcusunuz...");
        else if ((month==10 && day>22) || (month==11 && day<22)) System.out.println("Akrep burcusunuz...");
        else if ((month==11 && day>21) || (month==12 && day<22)) System.out.println("Yay burcusunuz...");
        else if ((month==12 && day>21) || (month==1 && day<22)) System.out.println("Oğlak burcusunuz...");
        else if ((month==1 && day>21) || (month==2 && day<20)) System.out.println("Kova burcusunuz...");
        else if ((month==2 && day>19) || (month==3 && day<21)) System.out.println("Balık burcusunuz...");
        else System.out.println("hatalı giriş yaptınız!");
        }

    }
