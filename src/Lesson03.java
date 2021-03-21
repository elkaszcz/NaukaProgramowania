public class Lesson03 {
    // Petle - while, do-while, for
    public static void main(String[] args) {
        int x = 0;

        // Petla while
        while(x < 4) {
            System.out.print("*");
            x = x + 2;
        }

        // Petla do-while
        x = 0;
        do {
            System.out.print("*");
            x += 1;
        } while (x < 4);

        // Petla do-while
        for(int i = 0; i < 4; i += 2) {
            System.out.print("*");
        }


    }
}
