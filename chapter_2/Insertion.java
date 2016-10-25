public class Insertion {
    
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) {
        for(int i = 0; i < a.length(); i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for(int i = 1; i < a.length(); i++) {
            if(less(a[i], a[i-1])) return false; 
        }
        return true;
    }

    public static void sort(Comparable[] a) {
        int N = a.length();
        for(int i = 1; i < N; i++) {
            //将a[i]插入到a[i-1], a[i-2], a[i-3],...之中
            for(int j = i; j > 0 && less(a[j], a[j-1]); j--) {
                exch(a, j, j-1);
            }
        }
    }
} 
