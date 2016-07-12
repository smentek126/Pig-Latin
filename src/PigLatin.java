import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String vowels = "aeiouAEIOU";
        int go = 0;
        while (go < 5) {
            System.out.println("Enter your word.");
            String word = sc.nextLine();					
            while (!word.equalsIgnoreCase("done")) {
                String beforVowel = "";
                int cut = 0;
                if (cut < word.length() && !vowels.contains("" + word.charAt(cut))) {
                    beforVowel += word.charAt(cut);
                    cut++;
                    System.out.println(word.substring(cut) + beforVowel + "ay");
                    word.equalsIgnoreCase("done");
                    break;
                } else {
                    System.out.println(word + "way");
                    word.equalsIgnoreCase("done");
                    break;
                }
            }
            System.out.println("Do you want to continue?");
            String userContinue = sc.nextLine();
            if (userContinue.charAt(0) == 'y') {
                System.out.println("Ok...");
                word.equalsIgnoreCase("go");
            } else {
                System.out.println("Goodbye!");
                go = 8;    
            }
        }
    }
}
