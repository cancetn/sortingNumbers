import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int s1, s2, s3;

        Scanner inp = new Scanner(System.in);

        System.out.println("Birinci sayiyi giriniz : ");

        s1 = inp.nextInt();

        System.out.println("Ikinci sayiyi giriniz : ");

        s2 = inp.nextInt();

        System.out.println("Ucuncu sayiyi giriniz : ");

        s3 = inp.nextInt();

        if ((s1 > s2) && (s1 > s3)) {
            if (s2 > s3) {
                System.out.println("Sayi1 > Sayi2 > Sayi3 " + s1 + s2 + s3);
            } else {
                System.out.println("Sayi1 > Sayi3 > Sayi2 " + s1 + s3 + s2);
            }

        } else if ((s2 > s1) && (s2 >s3)) {
            if(s1 > s3)
            {
                System.out.println("Sayi2 > Sayi1 > Sayi3 " + s2 + s1 + s3);

            }else{
                System.out.println("Sayi2 > Sayi3 > Sayi1 " + s2 + s3 + s1);
            }
        }else if((s3 > s2) && (s3 > s1)){
            if(s1 > s2){
                System.out.println("Sayi3 > Sayi1 > Sayi2 " + s3 + s1 + s2);
            }else{
                System.out.println("Sayi3 > Sayi2 > Sayi1 " + s3 + s2 + s1);
            }

        }


    }
}
