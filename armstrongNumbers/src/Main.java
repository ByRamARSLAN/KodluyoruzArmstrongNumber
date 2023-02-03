import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, basamakSayisi = 0;
        int total = 0;
        int basPow = 1;
        int numMod;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        number = input.nextInt();
        int tempNumber = number;

        while( tempNumber != 0 ){
            tempNumber /= 10;
            basamakSayisi ++;

        }

        tempNumber = number;
        System.out.println("tempNumber : " + tempNumber); // işlemin nasıl gittiğini kontrol etmek için yazıldı

        while(tempNumber != 0){
            numMod = tempNumber % 10;

            System.out.println("tempNumber : " + tempNumber); //işlemin nasıl gittiğini kontrol etmek için yazıldı
            System.out.println("nummod : " + numMod); //işlemin nasıl gittiğini kontrol etmek için yazıldı

            for(int i = 1; i <= basamakSayisi; i++){
                basPow *= numMod;
            }
            total += basPow;
            //System.out.println("Toplam : " + total); ** işlemin nasıl gittiğini kontrol etmek için yazıldı
            tempNumber /= 10;
            //System.out.println("basPow : " + basPow); ** işlemin nasıl gittiğini kontrol etmek için yazıldı
            basPow = 1;
            //System.out.println("basPow : " + basPow); ** işlemin nasıl gittiğini kontrol etmek için yazıldı
        }
        System.out.println("Girilen sayının basamak sayısı : " +basamakSayisi);
        System.out.println("Toplam : " + total);

        if(number == total){
            System.out.println("girilen sayı bir armstrong sayıdır.");
        }else{
            System.out.println("Girilen sayı bir armstrong sayı değildir.");
        }

    }
}