public class ExerciseIf {
    public static void main(String[] args) {
        int age = 51;

        if (age < 18) {
            System.out.println("Osoba jest dzieckiem");
        } else if (age <= 35) {
            System.out.println("Osoba jest mloda");
        } else if (age <= 50) {
            System.out.println("Osoba jest średniego wieku");
        } else {
            System.out.println("Osoba jest stara");
        }
    }
}
