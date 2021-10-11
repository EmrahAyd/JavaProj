import java.util.Arrays;
import java.util.Scanner;
public class ArraysGir {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int min = 1;
        int max= 1;
        int dizi[] = new int[5];
        System.out.println("5 haneli dizininin sırasıyla değerlerini giriniz.");
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(( i +1 )+ ".değer  =  ");
            dizi[i] = scn.nextInt();
        }

        for (int i : dizi){
            if (i < min ) {
                min = i;
            }
            if ( i  > max) {
                max = i;
            }
        }

        System.out.println("minumum =" + min);
        System.out.println("minumum =" + max);

    }
}
