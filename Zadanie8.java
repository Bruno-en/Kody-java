import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int i=1;
        int n=scan.nextInt();
        int silnia=1;
        for (i=1; i<=n; i++) { silnia=silnia*i;
            System.out.println("silnia= "+ silnia);}

    }
}
