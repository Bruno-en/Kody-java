import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int n = scan.nextInt();
        for (i = 0; i <= n; i++) {
            System.out.print("liczby : " + i) ;
            System.out.println(" " + (n-i));
        }
    }
}