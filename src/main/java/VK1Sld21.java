import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Scanner;

public class VK1Sld21 {

    public static void main(String[] args) {
        String lan;
        String cnt;
        String ans = "yes";  // Initialize with "yes" to enter the loop

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter preferred language:");
            lan = sc.nextLine();
            System.out.println("Enter the country:");
            cnt = sc.nextLine();

            // If command line arguments are passed, use those
            if (args.length == 2) {
                lan = args[0];
                cnt = args[1];
            }

            // Create locale
            Locale locale = new Locale(lan, cnt);
            try {
                // Load the resource bundle
                ResourceBundle bundle = ResourceBundle.getBundle("message", locale);

                // Print the localized messages
                System.out.println(bundle.getString("greeting"));
                System.out.println(bundle.getString("farewell"));
                System.out.println(bundle.getString("inquiry"));

            } catch (MissingResourceException e) {
                // Handle the case when the resource bundle is missing
                System.out.println("Error: Resource bundle for the specified language and country not found.");
                System.out.println("Please check if the properties file exists.");
            }

            // Ask user if they want to continue
            System.out.println("Do you want to continue? (y/n):");
            ans = sc.nextLine();

        } while (!ans.equalsIgnoreCase("n"));  // Use equalsIgnoreCase for case-insensitive comparison

        System.out.println("Goodbye!");
    }
}
