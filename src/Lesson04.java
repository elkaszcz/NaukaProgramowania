import java.util.Random;

// random number

public class Lesson04 {
    public static void main(String[] args) {
        int liczba = new Random().nextInt(7) + 1;
        System.out.println(liczba);
    }
}
