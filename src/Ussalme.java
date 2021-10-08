import java.util.Scanner;

public class Ussalme {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long a,b,i;
        System.out.println("Üssünü almak istediğin sayı :");
        a = scn.nextInt();
        System.out.println("Üssü kaç olacak...");
        b= scn.nextInt();


        for (i=1; i<b;i++) {

            a*=a;

        }
        System.out.println(a);
    }
}
