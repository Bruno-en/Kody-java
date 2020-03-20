import java.util.Scanner;

public class ZadanieTablice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tablica[] = new int[1001];
        for (int i = 0; i < tablica.length; i++)
        {tablica[i] = i;}
        System.out.print("Wpisz liczbe calkowita n ");
        int n = scan.nextInt();
        System.out.println("Wpisz n liczb calkowitych");
        for (int i=0; i<n; i++)
        { int a = scan.nextInt(); a= tablica[i];}
        System.out.println("Wybież znak + lub * ");
        String znak;
        znak = scan.next();
        int wynik = 0;
        int wynik1=1;
        for (int i = 0; i < n; i++) {

            if (znak == "+"){
                wynik = wynik+tablica[i];
            }
            if (znak == "*"){
                wynik = wynik1*tablica[i];
            }
        }
        System.out.println("wynik= "+ wynik);
     }
    }


