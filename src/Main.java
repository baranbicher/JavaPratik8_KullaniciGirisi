import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, select = null, newPassword;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adını Girin: ");
        userName = input.nextLine();

        System.out.print("Şifrenizi Girin: ");
        password = input.nextLine();

        if (userName.equals("brn") && password.equals("brn123")) {
            System.out.println("Giriş Yapıldı.");
        }
        else if (!(userName.equals("brn")) && !(password.equals("brn123"))) {
            System.out.println("Hatalı Giriş .Kullanıcı adı ve şifre yanlıştır!! Lütfen bilgileri kontrol edip tekrar deneyiniz.");
        }
        else if (!(userName.equals("brn")) && (password.equals("brn123"))) {
            System.out.println("Kullanıcı adı hatalı lütfen Kullanıcı adını kontrol edip tekrar deneyiniz.");
        }
        else if ((userName.equals("brn")) && !(password.equals("brn123"))) {
            System.out.println("Hatalı Şifre!!!");
            System.out.println("Şifrenizi unuttuysanız adımları takip edin\n Yeni şifre oluşturmak için : 'Evet' .\n Yeni Şifre oluşturmaktan vazgeçmek ve giriş ekranından ayrılmak için:'Hayır'.");
            System.out.print(" Seçiminiz: ");
            select = input.nextLine();

            if (select.equals("Evet") || select.equals("evet")){
                System.out.print("Yeni şifre giriniz .(Lütfen daha önceki şifrelerinizden farklı bir şifre oluşturunuz:");
                newPassword = input.nextLine();

                if (!newPassword.equals("brn123")){
                    System.out.println("Yeni şifreniz başarı ile oluşturuldu.");
                }
                else {
                    System.out.print("Hatalı deneme!! Yeni şifre eskisiyle aynı olamaz. Tekrar Deneyiniz");
                }
            }
        } else if (select.equals("Hayır") || select.equals("hayır")) {
            System.out.println("kullanıcı giriş sayfanda ayrılıyorsunuz ... iyi günler .");
         }else {
            System.out.print("Hatalı giriş yaptınız!! Lütfen sadece 'E ve H' seçeneklerinden birini giriniz.");
        }

    }
}