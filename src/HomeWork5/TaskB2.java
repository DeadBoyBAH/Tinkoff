package HomeWork5;

public class TaskB2 {
    static int[] a = new int[40000];

    static void rec(int pos, int max, int number) {
        if(number == 0) {
            System.out.print(a[0]);
            for (int j = 1; j < pos; j++) {
                System.out.print(" " + a[j]);
            }
            System.out.println("\n");
        } else {
            for (int j = 0; j <= Math.min(max, number); j++) {
                a[pos] = j;
                rec(pos+1, j, number-j);
            }
        }
    }
    public static void main(String[] args) {
        rec(0, 4,4);
    }
}
