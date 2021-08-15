public class InstrukcjeWarunkowe {
    public static void main(String[] args) {
        int wiek = 18;

        // a < b
        // a > b
        // a == b
        // a <= b
        // a >= b

        if(wiek <= 18) {
            System.out.println("Jestes niepelnoletni");
            System.out.println("wiec nie sprzedamy ci fajek i browara");
        }
        if(wiek >= 18) {
            System.out.println("Jestes pelnoletni");
            System.out.println("sprzedamy ci czego dusza zapragnie");
        }
    }
}
