import java.util.Scanner;
public class LoginTheme {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String user;
        int pswrd;
        int deneme = 1;

        while (deneme < 5  && deneme > 0) {

            System.out.println("Kullanıcı adını: ");
            user = scn.next();

            System.out.println("Şifrenizi giriniz: ");
            pswrd = scn.nextInt();

            if (user.equals("drea")) {
                if (pswrd == 1234) {

                    System.out.println("Hoşgeldiniz...");
                    deneme = 0;
                } else {
                    System.out.println("Hatalı şifre...");
                    deneme++;
                }
            }
            else {
                System.out.println("Hatalı kullanıcı adı...");
                deneme++;
            }
        }

        if (deneme==5) {

            System.out.println("Çok fazla geçersiz giriş yaptınız.....");
        }
    }
}
