import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        int a,b;
        Scanner inp = new Scanner(System.in);
        System.out.println("Gireceğiniz değerler hipotenüsünü bulmak istediğiniz bir dik üçgene ait olmalıdır.");
        System.out.println("ilk kenarını giriniz");
        a = inp.nextInt();
        System.out.println("İkinci kenarını giriniz");
        b = inp.nextInt();
        System.out.println("Hipotenüs = " + (Math.sqrt((a*a)+(b*b))));



    }
}
