import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;
        do {
            System.out.println(" liczba " + i);
            i++;
        } while (i <= n);

        for(i=0;i<=n;i++) {
            System.out.println(" liczby to "+ i);}
    }
}
