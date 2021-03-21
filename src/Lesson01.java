import java.util.Scanner;

// Instrukcje warunkowe - if
public class Lesson01 {
    public static void main(String[] args) {
        System.out.println("Podaj swoj wiek: ");
        int wiek = new Scanner(System.in).nextInt();
        System.out.println("Twoj wiek to: " + wiek);

        if(wiek < 0) return;
        if(wiek > 100) return;

        if (wiek < 20) {
            System.out.println("Jestes mlody.");
        } else if (wiek >= 20) {
            System.out.println("Jestes w srednim wieku lub stary.");
        }

    }
}
