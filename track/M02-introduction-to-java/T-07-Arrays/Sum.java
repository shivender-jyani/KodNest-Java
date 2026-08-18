import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int sum = 0;

        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i <= a.length - 1; i++) {
            sum += a[i];
        }

        System.out.println("Total: " + sum);
        sc.close();
    }
}