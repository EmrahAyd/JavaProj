import java.util.Scanner;



public class OrtHesap {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int mat,fiz,kimya,edebiyat,muzik;


        System.out.println( "Mat notunuz: ");
        mat = inp.nextInt() ;


        System.out.println( "fiz notunuz: ");
        fiz = inp.nextInt() ;

        System.out.println( "edebiyat notunuz: ");
        edebiyat = inp.nextInt() ;

        System.out.println( "Müzik notunuz: ");
        muzik = inp.nextInt() ;

        System.out.println( "Kimya notunuz: ");
        kimya = inp.nextInt() ;


        String Ortalama = (fiz + kimya + mat + edebiyat + muzik) / 5 >= 60 ? "Geçtiniz" : "Kaldınız";

        System.out.println(Ortalama);
    }
}