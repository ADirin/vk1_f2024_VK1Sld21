import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class VK1Sld21 {

    public static void main(String[] args) {
        String lan ;
        String cnt;

        if (args.length == 2) {
            lan = args[0];
            cnt = args[1];

        } else {
            lan = "fr";
            cnt = "FR";

        }
        Locale locale = new Locale(lan, cnt);
        ResourceBundle bundle = ResourceBundle.getBundle("message", locale);

        System.out.println(bundle.getString("greeting"));
        System.out.println(bundle.getString("farewell"));
        System.out.println("inquiry");



    }
}
