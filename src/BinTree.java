import java.util.Random;

public class BinTree {

    static void swap(int[] tab, int a, int b) {
        int old = a;
        tab[a] = tab[b];
        tab[b] = old;
    }

    public static void main(String[] args) {
        int N = 31;
        int[] d = new int[N+1];
        int i,j,k,x;

        for (i = 0; i < d.length; i++) {
            d[i] = new Random().nextInt(9) + 1;
        }

        for (int element: d) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Budujemy kopiec
        for(i = 2; i <= N; i++)
        {
            j = i;
            k = j / 2;
            x = d[i];
            while((k > 0) && (d[k] < x))
            {
                d[j] = d[k];
                j = k;
                k = j / 2;
            }
            d[j] = x;
        }
//        for(int i = 0; i < tab.length; i++) {
//            int r = new Random().nextInt(100) + 1;
//            tab[i] = r;
//        }
// Prezentujemy wyniki

        x = (N + 1) / 2; k = 2;
        for(i = 1; i <= N; i++)
        {
            for(j = 1; j <= x - 1; j++) System.out.print(" ");
            System.out.print(d[i]);
            for(j = 1; j <= x; j++) System.out.print(" ");
            if(i + 1 == k)
            {
                k += k;
                x /= 2;
                System.out.println();
            }
        }

        System.out.println();
        System.out.println();
        for (int element: d) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
