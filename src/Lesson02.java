public class Lesson02 {
    // Typ boolean
    public static void main(String[] args) {
        boolean isTall = false;
        int heightCM = 190;

        isTall = heightCM >= 180;
        System.out.println("Is the guy tall: " + isTall);

        int x = 15;
        String y = (x < 10) ? "OK" : "Not OK";
        System.out.println(y);
    }
}
