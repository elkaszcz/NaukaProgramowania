public class Loops {
    public static void main(String[] args) {
        int x = 0;

        System.out.println("while");
        while (x < 5) {
            System.out.println(x);
            x += 1;
        }

        System.out.println("do..while");
        x = 0;
        do {
            System.out.println(x);
            x += 1;
        } while (x < 5);

        System.out.println("for");
        for(x = 0; x < 5; x++) {
            System.out.println(x);
        }

    }
}
