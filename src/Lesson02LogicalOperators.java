public class Lesson02LogicalOperators {
    public static void main(String[] args) {
        int x = 8;
        int y = 23;
        boolean isTall = x>=5;

        //operator logiczny AND
        if (isTall && y <= 20) {
            System.out.println("prawda");
        }

        //operator logiczny OR
        if ((x == 8) || (y < 20)) {
            System.out.println("warunek spelniony");
        }
    }


}
