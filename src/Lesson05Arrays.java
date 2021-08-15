public class Lesson05Arrays {
    public static void main(String[] args) {
        int[] tab = new int[1000];
        tab[2] = 1300;
        tab[7] = 112;
        tab[9] = 10000;
//        System.out.println("tab[2] = " + tab[2]);
//        System.out.println("tab[7] = " + tab[7]);
        int tabLength = tab.length;
        System.out.println("tab ma dlugosc " + tabLength);
        for(int i = 0; i < tabLength; i++) {
            System.out.println(i + ": " + tab[i]);
        }

//        int[] tab2 = {10, 13, 4};
//        System.out.println(tab2[0]);
//        System.out.println(tab2[1]);
//        System.out.println(tab2[2]);
//        System.out.println(tab2[3]);
    }
}
