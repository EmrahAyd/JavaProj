import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double kdv;
        double urun;
        System.out.println("Ürününüzün fiyatını giriniz....");

        urun = inp.nextInt();

        kdv = urun * 0.18;

        System.out.println("KDV'li fiyatı : "+ (urun+kdv));
        System.out.println("KDV tutatrı : " + kdv);





    }
}
